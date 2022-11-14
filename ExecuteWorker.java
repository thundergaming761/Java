import java.util.*;
class Worker
{
String name;
double salary;
double rate=10.0;
}
class DailyWorker extends Worker
{
void comPay(int hours)
{
salary=hours*rate;
System.out.println("Name= "+name);
System.out.println("Salary of daily worker= "+salary);
}
}
class SalariedWorker extends Worker
{
void compPay()
{
System.out.println("Name= "+name);
salary=40*rate;
System.out.println("Salary of salaried worker = "+salary);
}
}
public class ExecuteWorker
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
DailyWorker w=new DailyWorker();
System.out.println("Enter the number of hours for daily worker");
int h=sc.nextInt();
System.out.println("Enter the name");
w.name=sc.next();
w.comPay(h);
SalariedWorker w1=new SalariedWorker();
System.out.println("Enter the name of salaried worker");
w1.name=sc.next();

w1.compPay();
}
}