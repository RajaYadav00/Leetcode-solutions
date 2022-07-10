# Write your MySQL query statement below
select p.firstname,p.lastname, c.city ,c.state from Person p left join address c on p.personid=c.personid;