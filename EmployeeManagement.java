import java.util.Scanner;

class Employee{
    String Name;
    int id;
    double Salary;

    public Employee(String Name,int id,double Salary){
        this.Name=Name;
        this.id=id;
        this.Salary=Salary;
    }

    void display(){
        System.out.println("Employee Name:"+Name);
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Basic Salary"+Salary);
    }

    double calculateSalary(){
        return Salary;
    }
}
class Developer extends Employee{
    Developer(String Name,int id,double Salary){
        super(Name,id,Salary);
    }
    double calculateSalary(){
        return Salary+5000;
    }
}
class Manager extends Employee{
    Manager(String Name,int id,double Salary){
        super(Name,id,Salary);
    }
    double calculateSalary(){
        return Salary+10000;
    }
}

class EmployeeManagement{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Emplyoee Name");
        String Employename=in.nextLine();
        System.out.println("Enter Employee ID");
        int Employeeid=in.nextInt();
        System.out.println("Enter Emloyee Basic Salary");
        double Basicsalary=in.nextDouble();
        System.out.println("####################");
        System.out.println("1.Development");
        System.out.println("2.Manager");
        System.out.println("Enter Your Choice");
        int choice=in.nextInt();
        Employee emp;
        switch(choice)
        {
            case 1:
              emp=new Developer(Employename,Employeeid,Basicsalary);
              break;
            case 2:
                emp=new Manager(Employename,Employeeid,Basicsalary);
                break;
            default:
                System.out.println("Invalid input");
                in.close();
                return;
        }
        System.out.println("<--------Employee Deatils------->");
        emp.display();
        System.out.println("Total Salary:"+emp.calculateSalary());
        in.close();
    }
}
