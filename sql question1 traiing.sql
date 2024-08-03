create database ecommerce;

use ecommerce;

create table employees(
EmployeeID INT primary key Auto_increment,
EmployeeName varchar(50),
DepartmentID INT);
drop table employees;
create table Departments(
DepartmentID INT primary key,
DepartmentName varchar(50));

create table projects(
ProjectID INT primary key,
ProjectName varchar(50),
DepartmentID INT,
foreign KEY (DepartmentID) references Departments(DepartmentID)
);

alter table employees
add foreign key(DepartmentID) references Departments(DepartmentID);

insert into employees(EmployeeName,DepartmentID) values ('John',1),('Jane',2),('Mark',1),('Emily',3),('Karen',5);

INSERT INTO Departments (DepartmentID, DepartmentName) VALUES
(1, 'Sales'),
(2, 'HR'),
(3, 'IT');

insert into Departments (DepartmentID, DepartmentName) Values
(4, 'Marketing');

insert into Departments(DepartmentID,DepartmentName) values(5, NULL);

insert into projects(ProjectID,ProjectName,DepartmentID) values (101,'Project A',1),(102,'Project B',2),(103,'Project C',3),(104,'Project D',4),(105,'Project E',null);



-- 1st query
-- Retrieve the list of employees along with their department names where employees are associated with departments.

SELECT 
    e.EmployeeName,
    d.DepartmentName
FROM 
    employees e
JOIN 
    Departments d
ON 
    e.DepartmentID = d.DepartmentID;
    
-- 2nd query
-- Retrieve all employees and their associated department names. If an employee does not belong to a department, show NULL.

SELECT 
    e.EmployeeName,
    d.DepartmentName
FROM 
    employees e
LEFT JOIN 
    Departments d
ON 
    e.DepartmentID = d.DepartmentID;
    
-- 3rd query
-- Retrieve all departments and the names of employees in those departments. If a department does not have any employees, show NULL.
select 
	e.EmployeeName,
    d.DepartmentName
From
	Departments d
Left join
	employees e
ON
	e.DepartmentID = d.DepartmentID;
    
-- 4th
-- Retrieve all possible combinations of employees and projects.

select * from Employees cross join Projects ;

-- 5th
-- Retrieve the list of employees whose department ID is greater than the department ID of 'HR' department.
SELECT 
    e.EmployeeName,
    e.DepartmentID
FROM 
    employees e
WHERE 
    e.DepartmentID > (
        SELECT 
            d.DepartmentID
        FROM 
            Departments d
        WHERE 
            d.DepartmentName = 'HR'
    );
    
-- 6th
-- Retrieve the list of projects along with their department names, where the projects are associated with departments
select 
	p.ProjectName,
    d.DepartmentName
From
	projects p 
Inner join
	Departments d
ON
	p.DepartmentID = d.DepartmentID;
    
-- 7th
-- Find employees who are not assigned to any department
SELECT 
    EmployeeID,
    EmployeeName
FROM 
    employees
WHERE 
    DepartmentID IS NULL;
    
-- 8th
-- Find departments that have no employees
SELECT 
    EmployeeName
FROM 
    employees
WHERE 
    DepartmentID IS NULL;
-- 9th
-- Find all departments along with the number of employees in each department
SELECT 
    d.DepartmentName,
    count(e.EmployeeID) AS NumberOfEmployees
FROM 
    Departments d
LEFT JOIN 
    employees e
ON 
    d.DepartmentID = e.DepartmentID
GROUP BY 
d.DepartmentName, d.DepartmentID;


 
select * from employees
    
    
