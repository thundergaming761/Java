import java.util.*;
interface test
{
int square(int a);
}
class arithmetic implements test
{
public int square(int x)
{
return x*x;
}
}
public class ToTestInt
{
public static void main(String[] args)
{
arithmetic obj=new arithmetic();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
System.out.println("Square of "+n+" is "+obj.square(n));
}
}