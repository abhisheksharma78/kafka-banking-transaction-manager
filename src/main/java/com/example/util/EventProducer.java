package com.example.util;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EventProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private DataSource dataSource;

    @Transactional
    public void produceEvents() {
        // Simulate application events (updates or transactions)
        for (int i = 0; i < 10; i++) {
            String eventId = "event-" + i;
            String eventType = (i % 2 == 0) ? "update" : "transaction";
            String eventData = "Event ID: " + eventId + ", Type: " + eventType;

            try (Connection connection = dataSource.getConnection()) {
                String sql = "INSERT INTO your_table_name (column1, column2) VALUES (?, ?)";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, eventId); // Assuming eventId goes to column1
                    statement.setString(2, eventType); // Assuming eventType goes to column2
                    statement.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            kafkaTemplate.send("bank_events", eventId, eventData);
        }
    }
}
