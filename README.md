# Employee Management System
## Overview
The Employee Management System is a simple Java console application that collects employee details and calculates the total salary based on the employee's role. It demonstrates inheritance, method overriding, and runtime polymorphism in Java.
## Features
- Accepts an employee's name, ID, and basic salary.
- Provides two role options:
  - Developer — adds 5,000 to the basic salary.
  - Manager — adds 10,000 to the basic salary.
- Displays the employee's details and calculated total salary.
- Handles an invalid role selection by displaying an error message and exiting.
## Salary Calculation
- Developer: Total Salary = Basic Salary + 5000
- Manager: Total Salary = Basic Salary + 10000
The program uses an Employee reference to refer to either a Developer or a Manager object. The overridden calculateSalary() method for the selected object is called at runtime.
## Example Run
### 1. ADDING EMPLOYEE TO DEVELOPER ROLE
Enter Emplyoee Name

Manoj S

Enter Employee ID

101

Enter Emloyee Basic Salary

5000

####################

1.Development

2.Manager

Enter Your Choice

1

<--------Employee Deatils------->

Employee Name:Manoj S

Employee Id:101

Employee Basic Salary5000.0

Total Salary:10000.0

### 2.ADDING EMPLOYEE TO MANAGER ROLE

Enter Emplyoee Name

Sharath 

Enter Employee ID

102

Enter Emloyee Basic Salary

15000

####################

1.Development

2.Manager

Enter Your Choice

2

<--------Employee Deatils------->

Employee Name:Sharath 

Employee Id:102

Employee Basic Salary15000.0

Total Salary:25000.0

### 3.ADDING EMPLOYEE BY GIVING WRONG CHIOICE 

Enter Emplyoee Name

Nisha

Enter Employee ID

103

Enter Emloyee Basic Salary

20000

####################

1.Development

2.Manager

Enter Your Choice

3

Invalid input

## Concepts Demonstrated
- Classes and objects
- Inheritance using extends
- Constructor chaining using super()
- Method overriding
- Runtime polymorphism
- User input using Scanner
- Conditional selection using switch
## Notes
- Select 1 for Developer or 2 for Manager.
- Any other role choice displays Invalid input and exits the program.
- The salary additions are fixed values in the current implementation.
## Author
 **Manoj S.**
