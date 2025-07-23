# Sso Token Service

Sso Token Service is a personal SSO system project developed with Spring Boot and PostgreSQL and can insert SSO user data on Swagger UI and have response(response body).

## Features
This project can save data and update if have same day-month-year and HH:MM:ss. After you save swagger show 
this response body . There have responseCode, responseMessage , responseData. In responseData have userid and tokenid.

## Tool
* IntelliJ : running program 
* Spring Framework version 3.3.0
* JDK version 21.0
* PostgreSQL version 15.13
* Maven version 3.9.11
* Swagger 

## Install

* [Download IntelliJ](https://www.jetbrains.com/idea/download/?section=windows#) if you don't have IntelliJ program before.
* [Download JDK version 21](https://download.oracle.com/java/21/archive/jdk-21.0.7_windows-x64_bin.exe) if you don't have JDK version 21 before.
* [Download Maven](https://maven.apache.org/download.cgi) if you don't have Maven before.
 ```
#check version JDK
java --version

#check version Maven
mvn --version
 ```
*  [Download PostgreSQL version 15.13](https://www.postgresql.org/download/) if you don't have PostgreSQL version 15.13 before.

## How to use with file

* if you already Install with my List. 
* First , you should set up database in PostgreSQL to create new role(about username password have at pom.xml) ,create new database(name : ssotest) and create table (name : sso_user_test)
 ```
 #create table sso_user_test
 
drop table sso_user_test;

create table sso_user_test
(
request_date          timestamp not null
constraint pk_sso_user_test
primary key,
ssotype               varchar(50),
systemid              varchar(50),
systemname            varchar(250),
systemtransactions    varchar(250),
systemprivileges      varchar(250),
systemusergroup       varchar(50),
systemlocationgroup   varchar(50),
userid                varchar(200),
userfullname          varchar(500),
userrdofficecode      varchar(250),
userofficecode        varchar(250),
clientlocation        varchar(250),
locationmachinenumber varchar(500),
tokenid               varchar(1000)
);
 ```

* Next Step you can clone my project and open on IntelliJ.
* Finally You can run project and open link Swagger (http://localhost:8080/apitest/swagger-ui/.html).

## How to use Swagger

* First, you open http://localhost:8080/apitest/swagger-ui/.html .
* Second , you select post:app-controller/gentoken.
* Then, you click try it out and insert data.

  Example Data
```
  {
  "requestDate": "2025-07-23T02:23:52.078Z",
  "ssotype": "string",
  "systemid": "string",
  "systemname": "string",
  "systemtransactions": "string",
  "systemprivileges": "string",
  "systemusergroup": "string",
  "systemlocationgroup": "string",
  "userid": "string",
  "userfullname": "string",
  "userrdofficecode": "string",
  "userofficecode": "string",
  "clientlocation": "string",
  "locationmachinenumber": "string",
  "tokenid": "string"
}
```
* Next, you click excute(save) and have output response body.

```
#responecode on response body
I0700 OK 200 you insert success and show userid,tokenid.
E000001 Error 400 you cannot post data and show data with not error.
E000002 Error500 you cannot connect database and don't show userid,tokenid.
```
* Finally, you have finnish if responsecode show I07000.

  Example responsecode show I07000

```  	
{
  "responseCode": "I07000",
  "responseMessage": "ทำรายการเรียบร้อย",
  "responseData": {
    "userid": "string",
    "tokenid": "string"
  }
}
```



