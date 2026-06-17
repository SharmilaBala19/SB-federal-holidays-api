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
## give the  path where csv file created to upload
curl -X POST http://localhost:8080/api/holidays/upload -F "file=@C:\Users\bala_\IdeaProjects\FederalHolidayAssessment\holidays.csv"

