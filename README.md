# Simple Inventory Tracker

## Project Description
The Simple Inventory Tracker is a basic application built using Spring Boot that allows users to manage a small set of products. The system includes features such as adding and displaying products, searching for products by name, and displaying products that need restocking (quantity below a specified threshold).

## Demo
https://github.com/Avinash4231/Simple-Inventory-Tracker-using-spring-boot/assets/119235391/5da058b4-1ce8-4133-86cb-f7011fe46bb4



## Features
- **Add Products**: Add new products to the inventory.
- **Display Products**: View the list of all products.
- **Search Products**: Search for products by name.
- **Low Stock Alert**: Display products that need restocking.

## Requirements
- **Programming Language**: Java
- **Framework**: Spring Boot
- **Database**: MySQL Database
- **User Interface**: Swagger-UI for API documentation and interaction

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven

### Installing

1. **Clone the repository**:
    ```bash
    git clone https://github.com/yourusername/simple-inventory-tracker.git
    cd simple-inventory-tracker
    ```

2. **Build the project**:
    ```bash
    mvn clean install
    ```

3. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

4. **Access the application**:
    - Swagger UI: `http://localhost:8080/swagger-ui.html`
    

## API Endpoints

### Add a Product
- **URL**: `/api/products`
- **Method**: `POST`
- **Request Body**:
    ```json
    {
        "name": "Product Name",
        "quantity": 10
    }
    ```
- **Response**: The added product

### Get All Products
- **URL**: `/api/products`
- **Method**: `GET`
- **Response**: List of all products

### Search Product by Name
- **URL**: `/api/products/search`
- **Method**: `GET`
- **Parameters**: `name` (string)
- **Response**: The product with the given name

### Get Low Stock Products
- **URL**: `/api/products/low-stock`
- **Method**: `GET`
- **Parameters**: `threshold` (integer)
- **Response**: List of products with quantity below the threshold

## Database Configuration

The application uses an MySQL in-memory database. The configuration is specified in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/avidb
spring.datasource.username=root
spring.datasource.password=Anynomous
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update 
