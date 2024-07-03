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
- **Database**: H2 Database
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
    - H2 Console: `http://localhost:8080/h2-console`
      - **JDBC URL**: `jdbc:h2:mem:inventorydb`
      - **Username**: `sa`
      - **Password**: *(leave blank)*

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

The application uses an H2 in-memory database. The configuration is specified in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:inventorydb;DB_CLOSE_DELAY=-1
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
