#  Dogs API

This is a Spring Boot REST API for managing dog records in a MySQL database. It allows you to create, read, update, and delete dogs, as well as filter them by name and breed.

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/dogs-api.git
cd dogs-api

2. Set Up MySQL
Create a database called dogs
Run this SQL to create the table:
CREATE TABLE dogs (
  dog_id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  breed VARCHAR(255) NOT NULL,
  age DOUBLE NOT NULL
);

3. Configure application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/dogs?useSSL=false
spring.datasource.username=root
spring.datasource.password=mysql
spring.jpa.hibernate.ddl-auto=update

API Endpoints
Base URL: http://localhost:8080/dogs
Method	Endpoint	Description
GET	/all	Get all dogs
GET	/{dogId}	Get a specific dog by ID
GET	/name?search={value}	Get dogs whose names contain string
GET	/breed/{breed}	Get all dogs of a specific breed
POST	/new	Add a new dog
PUT	/update/{dogId}	Update an existing dog
DELETE	/delete/{dogId}	Delete a dog


Kaz Chhan-Kong
Kaazzzz
