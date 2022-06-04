CREATE TABLE person (id NUMBER, email varchar2(255), CONSTRAINT person_id_pk PRIMARY KEY(id)) ;
INSERT INTO person (id, email) VALUES (1, 'a@b.com');
INSERT INTO person (id, email) VALUES (2, 'c@d.com');
INSERT INTO person (id, email) VALUES (3, 'a@b.com');


SELECT email FROM person GROUP BY email HAVING count(email) > 1;