# gs-mysql-data
Initial version of commit.

To create dadabase do the following:
mysql> create database db_example; -- Create the new database
mysql> create user 'springuser'@'localhost' identified by '0000'; -- Creates the user
mysql> grant all on db_example.* to 'springuser'@'localhost'; -- Gives all the privileges to the new user on the newly created database


To start application launch spring-boot:run.

Then in browser if you want to add new canton go to 
http://localhost:8080/demo/canton/add?name=Aargau

After adding canton go to 
http://localhost:8080/demo/station/add?name=Bern&cantonId=1
in order to add new station.

To add new user go to 
http://localhost:8080/demo/user/add?name=First&last_name=Skachkov&email=someemail@someemailprovider.com

To get list of users:
http://localhost:8080/demo/user/all

and so on.
Future improvement goal is to:
1) move from Spring Boot to Spring MVC application with external TomCat server
2) finish implementing database in Java code.

