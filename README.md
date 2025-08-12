📦 Product Management System

A simple and clean backend application built using Java, MySQL, and REST API, tested via Postman.
This project demonstrates CRUD operations, database integration, and API-driven design — perfect for learning backend development.
🚀 Features

    Add new products to the system

    Retrieve product details by ID or list all products

    Update existing product information

    Delete products from the database

    Well-structured code for easy understanding

🛠 Tech Stack

    Java (Core backend logic)

    MySQL (Database)

    Spring Boot (REST API framework)

    Postman (API testing)

    Maven (Build tool)

   

Configure the database

    Create a MySQL database named product_db

    Update your application.properties:

    spring.datasource.url=jdbc:mysql://localhost:3306/product_db
    spring.datasource.username=YOUR_USERNAME
    spring.datasource.password=YOUR_PASSWORD
    spring.jpa.hibernate.ddl-auto=update

Run the application

    mvn spring-boot:run

    Test with Postman

        POST /products → Add a product

        GET /products → Get all products

        GET /products/{id} → Get product by ID

        PUT /products/{id} → Update product

        DELETE /products/{id} → Delete product

📌 API Endpoints
Method	Endpoint	Description
POST	/products	Add new product
GET	/products	Get all products
GET	/products/{id}	Get product by ID
PUT	/products/{id}	Update product
DELETE	/products/{id}	Delete product
