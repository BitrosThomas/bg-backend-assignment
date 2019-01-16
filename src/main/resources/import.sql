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
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl3', 'Earth', 'Attica', 'its normal', '100 days refund','500000.0','4.4');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl4', 'Jupiter', 'Attica', 'its normal', 'no refund','120000.0','3.5');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl5', 'Mercury', 'Attica', 'its normal', '50 days refund','14000.0','2.8');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl6', 'Neptune', 'Attica', 'its normal', '60 days refund','370000.0','4.2');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl7', 'Venus', 'Attica', 'its normal', '70 days refund','10000.0','2.3');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl8', 'Pluto', 'Attica', 'its normal', '80 days refund','250000.0','4.9');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl9', 'Saturn', 'Attica', 'its normal', '50 days refund','50000.0','1.5');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl10', 'Earth', 'Attica', 'its normal', '45 days refund','53000.0','3.1');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl11', 'Earth', 'Attica', 'its normal', '30 days refund','20000.0','2.7');
INSERT INTO UNIT (unit_image, unit_title, unit_region, unit_description, unit_cancellation, unit_price, unit_score) VALUES ('imageurl12', 'Earth', 'Attica', 'its normal', '100 days refund','500000.0','4.8');