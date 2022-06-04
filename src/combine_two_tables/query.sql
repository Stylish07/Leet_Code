Create TABLE Person (personId NUMBER, firstName varchar2(255), lastName varchar2(255), CONSTRAINT person_personid_pk PRIMARY KEY(PERSONID));
Create table Address (addressId number, personId number, city varchar2(255), state varchar2(255), CONSTRAINT address_addressid_pk PRIMARY KEY(ADDRESSID));
insert into Person (personId, lastName, firstName) values ('1', 'Wang', 'Allen');
insert into Person (personId, lastName, firstName) values ('2', 'Alice', 'Bob');
insert into Address (addressId, personId, city, state) values ('1', '2', 'New York City', 'New York');
insert into Address (addressId, personId, city, state) values ('2', '3', 'Leetcode', 'California');

SELECT p.firstname, p.lastname, a.city, a.state
FROM person p, address a
WHERE p.personid = a.personid(+);