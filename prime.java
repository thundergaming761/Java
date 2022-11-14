import java.util.*;
public class prime
{
public static void main(String[] args)
{
int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c>2)
{
System.out.println(n+" is not a prime number");
}
else
{
System.out.println(n+" is a prime number");
}
}
}