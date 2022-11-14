import java.util.*;
class Employee
{
String name;
String empid;
double salary;
Employee()
{
}
Employee(String name,String empid,double salary)
{
this();
this.name=name;
this.empid=empid;
this.salary=salary;
}
String getname()
{
return name;
}
double getsalary()
{
return salary;
}
void increaseSalary(double p)
{
salary=salary+(p*salary)/100;
}
}
public class Manager extends Employee
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the employee");
String n=sc.nextLine();
System.out.println("Enter the employee id of the employee");
String id=sc.nextLine();
System.out.println("Enter the salary of the employee");
double sal=sc.nextDouble();
Employee e=new Employee(n,id,sal);
System.out.println("Name of the employee is "+e.getname());
System.out.println("Employee id= "+e.empid);
System.out.println("Salary of the employee is "+e.getsalary());
System.out.println("Enter the percentage by which you want to inscrease "+e.name+" salary");
double p=sc.nextDouble();
System.out.println("Original salary= "+e.salary);
e.increaseSalary(p);
System.out.println("New Salary= "+e.salary);
}
}