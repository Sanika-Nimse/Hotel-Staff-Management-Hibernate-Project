# Hotel Staff Management System (Hibernate)

This project implements a basic Hotel Staff Management System using Hibernate for object-relational mapping (ORM). It allows you to manage hotel managers, staff, and chefs through a simple console interface.

## Features

-   **Add Hotel Manager:** Register new hotel managers with their ID and name.
-   **Add Hotel Staff:** Register hotel staff with their ID, name, shift, and duration.
-   **Add Hotel Chef:** Register hotel chefs with their ID, name, specialization, and rating.
-   **View All Records:** Display all the registered hotel personnel (managers, staff, and chefs).
-   **Exit:** Terminate the application.

## Technologies Used

-   Java
-   Hibernate ORM
-   MySQL (or any other database supported by Hibernate)

## Prerequisites

-   Java Development Kit (JDK) 8 or later
-   Maven (for dependency management)
-   MySQL (or your preferred database)
-   Basic understanding of Hibernate and JDBC

## Setup

1.  **Clone the Repository:**

    ```bash
    git clone []
    cd hotel-staff-management
    ```

2.  **Configure Database:**

    -   Create a database for the project (e.g., `hotel_db`).
    -   Update the `hibernate.cfg.xml` file with your database credentials:

        ```xml
        <hibernate-configuration>
            <session-factory>
                <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
                <property name="connection.url">jdbc:mysql://localhost:3306/hotel_db</property>
                <property name="connection.username">your_username</property>
                <property name="connection.password">your_password</property>
                <property name="dialect">org.hibernate.dialect.MySQL8Dialect</property>
                </session-factory>
        </hibernate-configuration>
        ```

    -   Ensure you have the correct MySQL Connector/J dependency in your `pom.xml`.

3.  **Build the Project:**

    ```bash
    mvn clean install
    ```

4.  **Run the Application:**

    ```bash
    java -cp target/hotel-staff-management-1.0-SNAPSHOT.jar com.demo.App
    ```
