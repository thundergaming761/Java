import java.util.*;
public class peterson
{
int factorial(int x)
{
int f=1;
for(int i=1;i<=x;i++)
{
f=f*i;
}
return f;
}
public static void main(String[] args)
{
int s=0;
Scanner sc=new Scanner(System.in);
peterson obj=new peterson();
System.out.println("Enter a number");
int n=sc.nextInt();
int t=n;
while(t!=0)
{
int r=t%10;
int f=obj.factorial(r);
s=s+f;
t=t/10;
}
if(n==s)
{
System.out.println(n+" is a peterson number");
}
else
{
System.out.println(n+" is not a peterson number");
}
}
}
