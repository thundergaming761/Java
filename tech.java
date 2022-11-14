import java.util.*;
public class tech
{
public static void main(String[] args)
{
int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int t=n;
while(t!=0)
{
int r=t%10;
c++;
t=t/10;
}
if(c%2!=0)
{
System.out.println(n+" is not a tech number");
}
else
{
int y=n%(int)(Math.pow(10,c/2));
int x=n/(int)(Math.pow(10,c/2));
if((x+y)*(x+y)==n)
{
System.out.println(n+" is a tech number");
}
else
{
System.out.println(n+" is not a tech number");
}
}
}
}