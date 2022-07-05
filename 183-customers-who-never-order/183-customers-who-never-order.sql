# Write your MySQL query statement below

select customers.name as 'Customers' from customers where customers.Id not in ( select customerId from orders );