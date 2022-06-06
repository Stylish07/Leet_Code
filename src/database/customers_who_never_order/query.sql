CREATE table customers(id NUMBER, name varchar2(255), CONSTRAINT customers_id_pk PRIMARY key(id));
CREATE TABLE orders(id NUMBER, customerid NUMBER, CONSTRAINT orders_id_pk PRIMARY key(id), constraint orders_customerid_fk FOREIGN KEY(customerid) REFERENCES customers(id));
INSERT INTO customers(id, name) VALUES (1, 'Joe');
INSERT INTO customers(id, name) VALUES (2, 'Henry');
INSERT INTO customers(id, name) VALUES (3, 'Sam');
INSERT INTO customers(id, name) VALUES (4, 'Max');
INSERT INTO orders(id, customerid) VALUES (1, 3);
INSERT INTO orders(id, customerid) VALUES (2, 1);


SELECT c.name customers
FROM customers c, orders o
WHERE c.id = o.customerid(+) AND o.id is NULL;