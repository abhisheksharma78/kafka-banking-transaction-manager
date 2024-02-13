# kafka-banking-transaction-manager
An end-to-end Spring Boot application integrated with Kafka for efficient management of user accounts and transactions. Features include CRUD operations for user accounts, real-time transaction processing, and a user-friendly dashboard UI for seamless interaction.

# Spring Boot Application with Kafka Integration

This Spring Boot application is designed for managing user accounts and transactions efficiently, leveraging Apache Kafka for event-driven architecture.

## Features

- **User Account Management**: Perform CRUD operations on user accounts, including creation, retrieval, update, and deletion.
- **Real-time Transaction Processing**: Utilize Kafka for processing transactions in real-time, ensuring data consistency and reliability.
- **Dashboard UI**: Access a user-friendly dashboard interface for seamless interaction with the application.
- **Integration with Kafka**: Employ Kafka's distributed messaging system for event-driven communication between different components of the application.

## Setup

1. **Prerequisites**: Ensure you have Java Development Kit (JDK), Apache Kafka, and MySQL installed on your system.
2. **Clone Repository**: Clone this repository to your local machine using the following command:

    ```bash
    git clone https://github.com/yourusername/spring-boot-kafka-account-transaction-manager.git
    ```

3. **Database Configuration**: Update the `application.properties` file in the `src/main/resources` directory with your MySQL database configurations.
4. **Kafka Configuration**: Configure Kafka properties in the `application.properties` file to connect to your Kafka broker.
5. **Run Application**: Use Maven or Gradle to build and run the Spring Boot application:

    ```bash
    mvn spring-boot:run
    ```

6. **Access Dashboard**: Open a web browser and navigate to `http://localhost:8080` to access the dashboard UI.

## Usage

- **User Account Management**: Use the provided RESTful endpoints to manage user accounts. Refer to the API documentation for details.
- **Transaction Processing**: Monitor transaction processing in real-time using Kafka topics.
- **Dashboard Interaction**: Interact with the dashboard UI to view account details, transaction history, and perform other operations.

## Contributors

- John Doe
- Jane Smith

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
