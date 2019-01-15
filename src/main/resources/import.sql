-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)

-- following script contains hash password values for password pass1234


INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl1', 'Moon', 'Darkside', 'its very cold', '10 days refund','1000.0','4');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl2', 'Mars', 'New York', 'its very warm', '20 days refund','20000.0','5');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl3', 'Earth', 'Attica', 'its normal', '30 days refund','500000.0','2');