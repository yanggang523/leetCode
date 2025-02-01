# Write your MySQL query statement below
SELECT p.firstname, p.lastname, a.city, a.state FROM  Address a RIGHT JOIN Person p ON p.personId = a.personId;