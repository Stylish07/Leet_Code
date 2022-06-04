Create table employee (id number, name varchar2(255), salary number, managerid NUMBER, CONSTRAINT employee_id_pk PRIMARY KEY(id));
INSERT INTO employee (id, name, salary, managerid) VALUES (1, 'Joe', 70000, 3);
INSERT INTO employee (id, name, salary, managerid) VALUES (2, 'Henry', 80000, 4);
INSERT INTO employee (id, name, salary) VALUES (3, 'Sam', 60000);
INSERT INTO employee (id, name, salary) VALUES (4, 'Max', 90000);


SELECT e1.name employee
FROM EMPLOYEE e1, EMPLOYEE e2
WHERE e1.managerid = e2.id AND e1.salary > e2.salary;