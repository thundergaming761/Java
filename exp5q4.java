import java.util.*;
interface A
{
double division(int a,int b);
double modules(int a,int b);
}
public class exp5q4 implements A
{
public double division(int x,int y)
{
return (x/(y*1.0));
}
public double modules(int x,int y)
{
return (x%y);
}
public static void main(String[] args)
{
exp5q4 obj=new exp5q4();
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("Division of "+x+" and "+y+" is "+obj.division(x,y));
System.out.println("Remainder of "+x+" and "+y+" is "+obj.modules(x,y));
}
}