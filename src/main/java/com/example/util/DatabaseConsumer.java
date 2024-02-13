package com.example.util;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class DatabaseConsumer {

    @Autowired
    private DataSource dataSource;

    @KafkaListener(topics = "bank_transactions", groupId = "database-consumer-group")
    public void consume(String message) {
        try (Connection connection = dataSource.getConnection()) {
            String sql = "INSERT INTO your_table_name (column1, column2) VALUES (?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Assuming your message contains the data to insert
                String[] data = message.split(",");
                statement.setString(1, data[0]); // Assuming first value goes to column1
                statement.setString(2, data[1]); // Assuming second value goes to column2
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
