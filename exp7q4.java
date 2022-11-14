import java.util.*;
public class exp7q4
{
static void check(int a,int b) throws ArithmeticException
{
if(a<0||b<0)
throw new ArithmeticException("Invalid input");
else
System.out.println(a/b);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a");
int a=sc.nextInt();
System.out.println("Enter the value of b");
int b=sc.nextInt();
try
{
check(a,b);
}catch(Exception e)
{
System.out.println(e);
}
}
}