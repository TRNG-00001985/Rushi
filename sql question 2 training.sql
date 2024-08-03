create database subq;

use subq;

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
add foreign key(DepartmentID) references Departments(DepartmentID) ;


insert into Employees(EmployeeName,DepartmentID) values ('John',1),('Jane',2),('Mark',1),('Emily',3);
insert into Departments(DepartmentID,DepartmentName) values(1,'Sales'),(2,'HR'),(3,'IT'),(4,'Marketing');
insert into Projects(ProjectID,ProjectName,DepartmentID) values (101,'Project A',1),(102,'Project B',2),(103,'Project C',3),(104,'Project D',4),(105,'Project E',null);

-- 1st
-- Find the names of employees who work in the same department as 'John'
select 	
	EmployeeName
from 
	employees
WHERE DepartmentID = (
    SELECT DepartmentID
    FROM employees
    WHERE EmployeeName = 'John'
);

-- 2nd
-- Find departments that have more than one employee
Select 
	DepartmentID,DepartmentName 
from 
	departments 
where 
	DepartmentID 
in 
	(Select DepartmentID from  Employees group by DepartmentID having  count(EmployeeID) > 1); 
    
-- 3rd
-- Find the projects that are not assigned to any department
SELECT ProjectID, ProjectName
FROM Projects
WHERE DepartmentID IS NULL;

-- 4th
-- Find the department with the maximum number of employees.
SELECT 
	DepartmentName
FROM 
	Departments
WHERE DepartmentID = (
    SELECT DepartmentID
    FROM Employees
    GROUP BY DepartmentID
    ORDER BY COUNT(EmployeeID) DESC
    LIMIT 1
);

-- 5th
-- Find employees who are working on projects in the 'Sales' department.
SELECT 
	e.EmployeeName
FROM 
	employees e
JOIN 
	Departments d ON e.DepartmentID = d.DepartmentID
JOIN Projects p ON d.DepartmentID = p.DepartmentID
WHERE d.DepartmentName = 'Sales';
   
  -- OR

SELECT 
	EmployeeName
FROM 
	employees
WHERE DepartmentID = (
    SELECT 
		DepartmentID
    FROM 
		Departments
	where
		DepartmentName = 'sales'
);

-- 6th
-- Find the names of departments that do not have any projects.

SELECT d.DepartmentName
FROM Departments d
LEFT JOIN Projects p ON d.DepartmentID = p.DepartmentID
WHERE p.ProjectID IS NULL;


-- 7th
-- Find employees who are not working on any project.
SELECT e.EmployeeName
FROM employees e
LEFT JOIN Projects p ON e.DepartmentID = p.DepartmentID
WHERE p.ProjectID IS NULL;

-- 8th
-- Find the department names and the number of employees in each department, only for departments with more than two employees.

SELECT 
	d.DepartmentName, COUNT(e.EmployeeID) AS EmployeeCount
FROM 
	employees e
JOIN 
	Departments d 
ON 
	e.DepartmentID = d.DepartmentID
GROUP BY 
	d.DepartmentID, d.DepartmentName
HAVING 
	COUNT(e.EmployeeID) > 2;

-- OR

SELECT d.DepartmentName, e.NumEmployees
FROM Departments d
JOIN (
    SELECT DepartmentID, COUNT(DepartmentID) AS NumEmployees
    FROM employees e
    GROUP BY DepartmentID
    HAVING COUNT(DepartmentID) > 2
) e ON d.DepartmentID = e.DepartmentID;

-- 9th
-- Find the projects handled by employees in the 'IT' department.

SELECT 
	ProjectName
FROM 
	Projects
WHERE DepartmentID = (
    SELECT 
		DepartmentID
    FROM 
		Departments
	where
		DepartmentName = 'IT'
);

-- 10th
-- Find the names of employees who do not work in the 'Marketing' department.

SELECT 
	EmployeeName
FROM 
	employees
WHERE DepartmentID IN (
    SELECT 
		DepartmentID
    FROM 
		Departments
	where
		DepartmentName <> 'Marketing'
);