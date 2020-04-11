# ehealthcare
Spring Boot JSP project

### Tools required

- Java 1.8 (min)
- IDE (Eclipse/Intellij/Netbeans/vscode)
- build tool (maven)
- css - 
- mysql

### DB Queries: (Sample Only)
CREATE DATABASE IF NOT EXISTS ehealthcare;
USE ehealthcare;

CREATE TABLE IF NOT EXISTS admin_details(name varchar(20), password varchar(16));
INSERT INTO admin_details(name, password) VALUES('admin', 'admin');
SELECT * FROM admin_details;

CREATE TABLE IF NOT EXISTS patient_details(name varchar(20), password varchar(16));


### Run:
mvn clean spring-boot:run

### Ref Links:
https://getbootstrap.com/docs/4.4/components/buttons/

