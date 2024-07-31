# Goal of the test
 * retrieve data from an external API
 * expose subset of this data via an API 

## 1. Check if all is alright to start
An empty Spring Boot application is provided.
 * It is set to work with `Java 17`
 * It is configured with maven

The url : `http://localhost:8080/actuator/health` must answer `{"status":"UP"}`

## 2. Data source

The data is a list of book that can be retrieved at : `https://labtestjava.free.beeceptor.com/books`

## 3. API endpoints to implement
The source api url must be configurable and not hardcoded.

### 3.1 List all the books

URL: `http://localhost:8080/api/books`

### 3.2 List all books written in english

URL: `http://localhost:8080/api/books/lang/en`




