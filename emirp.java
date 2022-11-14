import java.util.*;
public class emirp
{
boolean prime(int x)
{
int c=0;
for(int i=1;i<=x;i++)
{
if(x%i==0)
{
c++;
}
}
if(c==2)
return true;
else
return false;
}
public static void main(String[] args)
{
emirp obj=new emirp();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int rev=0;
int t=n;
while(t!=0)
{
int r=t%10;
rev=rev*10+r;
t=t/10;
}
if((obj.prime(n)==true)&&(obj.prime(rev)==true))
{
System.out.println(n+" is an emirp number");
}
else
{
System.out.println(n+" is not an emirp number");
}
}
}