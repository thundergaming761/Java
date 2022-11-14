import java.util.*;
public class isbn
{
public static void main(String[] args)
{
long s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
long n=sc.nextLong();
int k=1;
long t=n;
while(t!=0)
{
long r=t%10;
s=s+r*k;
t=t/10;
k++;
}
if(s%11==0)
{
System.out.println(n+" is a isbn number");
}
else
{
System.out.println(n+" is not a isbn number");
}
}
}