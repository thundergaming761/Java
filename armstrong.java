import java.util.*;
public class armstrong
{
public static void main(String[] args)
{
int s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int t=n;
while(t!=0)
{
int r=t%10;
s=s+(r*r*r);
t=t/10;
}
if(s==n)
{
System.out.println(n+" is an armstrong number");
}
else
{
System.out.println(n+" is not an armstrong number");
}
}
}