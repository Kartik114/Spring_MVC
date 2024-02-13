# Spring Boot Thymeleaf example: CRUD Application


Here We are working on the Spring mvc and spring boot application with Mysql as the database.

Schema and queries of DB used:

database : testdb

Table : Tutorial

columns: id, level, published, description, title

Command to create table in database:

'tutorial', 'CREATE TABLE `tutorial` (\n  `id` int NOT NULL,\n  `level` int NOT NULL,\n  `published` bit(1) DEFAULT NULL,\n  `description` varchar(128) NOT NULL,\n  `title` varchar(128) NOT NULL,\n  PRIMARY KEY (`id`)\n) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci'



How to run:

open the browser and type localhost:8080/  in it . It is howe page of it.

Further api's
1. GET API:  "/tutorials/new"  -> used to create a new tutorial to display on home page by saving.
2. POST API: "/tutorials/save"  -> used to save tutorial to db.
3. GET API: "/tutorials/{id}"  -> search tutorial by id
4. GET API: "/tutorials/delete/{id}" -> delete tutorial by id
5. GET API: "/tutorials/{id}/published/{status}" -> search with the id and published status.
