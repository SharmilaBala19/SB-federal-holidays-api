# Federal Holiday Tracking API Engine

Production-grade Spring Boot API scaffolding to record, maintain, and list statutory federal tracking configurations for the USA and Canada. Easily extensible via standard schema mapping arrays.

### Local Initialization Pipeline

#### Method A: Direct Execution (Recommended Quick-Run)
Ensure Java 26 and Maven (3.9.16) are installed locally. 
Download Java  for windows https://www.oracle.com/ca-en/java/technologies/downloads/#jdk26-windows and install with exe 
other OS  https://www.oracle.com/ca-en/java/technologies/downloads
download  maven  from https://maven.apache.org/download.cgi and unzip
```command prompt run

mvn clean spring-boot:run

Option 1: Using the Provided Postman Collection (Totest)
Since a Postman collection is a delivery requirement, this is the most visual and reviewer-friendly method.

Open Postman and click Import to load the postman_collection.json file from the project root.

Select the Bulk Ingest via CSV request from the collection.

Navigate to the Body tab and ensure form-data is selected.

Hover over the file key row, change the value type dropdown from Text to File.

Click Select Files and choose your sample holidays.csv file from your local machine.

Hit Send


Option 2: Via Swagger UI (If Embedded)
If you have embedded Springdoc OpenAPI/Swagger UI (http://localhost:8080/swagger-ui.html) into your Spring Boot application, the reviewer can test it directly from their web browser:

Navigate to http://localhost:8080/swagger-ui.html while the app is running.

Expand the POST /api/holidays/upload endpoint.

Click Try it out.

Click the Choose File / Browse button next to the file parameter to upload the CSV.

Click Execute to see the live JSON response array of saved holidays.
