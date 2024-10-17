# SwiftBuy-ResourceServer

## Overview

The SwiftBuy-ResourceServer is a core part of the SwiftBuy project, managing product data with a specification pattern for filtering. Built with Spring Boot, it will soon support OAuth2 and JWT authentication for secure service communication.

## Features

- **Specification Pattern**: Allows flexible filtering and searching of product data based on multiple criteria.
- **Redis for Cart Data**: Enables smooth transitions of cart data for better performance.
- **Spring Boot Framework**: Leverages Spring Boot for efficient and scalable application development.
- **MySQL Database**: Stores product and related data in a MySQL database.
- **Future OAuth2 and JWT Integration**: Authentication and authorization mechanisms to protect resources (coming soon).

## Getting Started

### Prerequisites

- **JDK 17** or higher
- **Maven**
- **MySQL Database** (Docker or local)
- **Redis** (Docker or local)

### Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Emon-Khan/SwiftBuy-ResourceServer.git
   ```


2. **Navigate to the Project Directory**

   ```bash
   cd SwiftBuy-ResourceServer
   ```
3. **Run MySQL and Redis with Docker (Optional)**
If you want to use MySQL and Redis through **Docker**, you can configure the environment variables by creating a **variables.env** file, which will store the necessary environment values.

Steps to create and use the **variables.env** file:

Create the variables.env file: In the root of your project directory, create a new file called **variables.env**.

Add the following environment variables to the variables.env file:
```bash
# MySQL Config
MYSQL_ROOT_PASSWORD: your_password
MYSQL_DATABASE: your_database_name
```

Start the services using **Docker Compose**:

Now, you can start MySQL and Redis with the following command:

```bash
docker-compose up
```
Docker Compose will automatically load the environment variables from the **variables.env** file.

Stop the services:

When you want to stop the running containers, use:

```bash
docker-compose down
```


4. **Alternatively, configure your local MySQL and Redis**

   Update the application.properties   file located in src/main/resources with your MySQL database details:

   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce-on-cloud
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

- For Redis, ensure Redis is running locally on the default port (6379).

4. **Build the Project**

   ```bash
   mvn clean install
   ```

5. **Run the application**

   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

### Get All Categories
- URL: /api/shop/categories
- Method: GET
- Description: Retrieve a list of all available product categories.
- Response: JSON array of category details.

### Get All Brands
- URL: /api/shop/brands
- Method: GET
- Description: Retrieve a list of all available product brands.
- Response: JSON array of brand details.


### Get All Products
- URL: /api/shop/products
- Method: GET
- Description: Retrieve a list of products, filtered by specification parameters.
- Response: JSON object of products.

### Get Product by ID
- URL: /api/shop/products/{id}
- Method: GET
- Description: Retrieve product details by ID.
- Response: JSON object of the product details.

### Create a New Basket
- URL: /basket
- Method: POST
- Description: Create a new basket with given items.
- Request Body:

```bash
{
    "id": "basketId",
    "items": [
        {
        "productId": "productId",
        "quantity": 2
        }
    ]
}
```
- Response: JSON object of the created basket.

### Get Basket by ID
- URL: /basket/{id}
- Method: GET
- Description: Retrieve a basket by its ID.
- Response: JSON object of the basket details.

### Delete Basket by ID
- URL: /basket/{id}
- Method: DELETE
- Description: Delete a basket by its ID.
- Response: Basket ID if successfully deleted.

## Future Improvements
- **OAuth2 and JWT Authentication**: Currently in development to enhance the security of the resource server.
- **Event-Driven Architecture**: Orders will trigger multiple background processes using a publisher-subscriber pattern, improving scalability and responsiveness.
- **Delivery Functionality**: Integration of a delivery system to manage the shipping and tracking of products.
- **Image-Based Product Search**: Users will be able to search for products by uploading an image, enhancing the shopping experience with advanced search capabilities.

### Screenshots
![image](https://github.com/user-attachments/assets/02506840-6c32-4887-9c7f-0c0e1b7144c4)
![image](https://github.com/user-attachments/assets/684b752b-a713-4772-ad00-60dea172c874)
![image](https://github.com/user-attachments/assets/f0c4c5b6-dafd-486a-8231-f596ce0ca5e7)
![image](https://github.com/user-attachments/assets/93f3ee37-9522-4502-81a1-260a9e5d3056)
![image](https://github.com/user-attachments/assets/472059d4-27d3-45ae-b310-c4c159f6b222)
![image](https://github.com/user-attachments/assets/e9ce164f-89ac-43c4-b076-5f24439498c9)
![image](https://github.com/user-attachments/assets/666a5504-d717-4d16-976f-605f32947ab9)




## Conclusion

The SwiftBuy-ResourceServer is designed to manage product data efficiently and securely. With the specification pattern for filtering and upcoming support for OAuth2 and JWT authentication, this service plays a key role in the SwiftBuy microservices architecture.


