--#1 SELECT * FROM northwind.customers; 


--#2 SELECT DISTINCT country_region FROM northwind.customers;

--#3 SELECT last_name from northwind.customers where last_name LIKE 'b%';

--#4 SELECT * FROM northwind.orders LIMIT 100;

--#5 SELECT * FROM Customers WHERE zip_postal_code IN (1010, 3012, 12209);

--#6 SELECT * FROM orders where orders.ship_country_region IS NOT NULL;

--#7 SELECT * FROM customers order by customers.country_region, customers.city;


--#8 INSERTcustomers (company, last_name, first_name, job_title, city) values ('Company F', 'McGrath', 'Pat', 'MakeUp Artist', 'New York');

--#9 UPDATE orders set orders.ship_zip_postal_code = '97201' where orders.ship_city='Portland';

--#10 DELETE from order_details where order_details.quantity = '1';

--#11 SELECT min(quantity), max(quantity), avg(quantity) from order_details;

--#12 SELECT min(quantity), max(quantity), avg(quantity) from order_details group by order_details.order_id;

--#13 SELECT customer_id from orders WHERE ID = 65;

--#14 SELECT * FROM orders inner JOIN customers on orders.customer_id=customers.id;
	  SELECT * FROM orders left JOIN customers on orders.customer_id=customers.id;
	  SELECT * FROM orders right JOIN customers on orders.customer_id=customers.id;

--#15 SELECT Employees.first_name from employees where employees.notes is null;

--#16 SELECT Ship_city FROM Orders o INNER JOIN Customers c ON o.customer_id=c.id WHERE c.first_name ='Francisco';