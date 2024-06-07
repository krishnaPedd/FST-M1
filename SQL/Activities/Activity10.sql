SELECT * FROM orders where salesman_id IN( SELECT salesman_id FROM customers where customer_id=3007);

SELECT * FROM orders where salesman_id IN( SELECT salesman_id FROM salesman where salesman_city='New York');

SELECT grade, COUNT(*) FROM customers
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

SELECT order_no,order_date,purchase_amount,salesman_id from orders 
WHERE salesman_id IN(SELECT salesman_id from salesman where commission=(SELECT MAX(commission) from salesman));
