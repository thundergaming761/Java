import java.util.*;
public class automorphic
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
int sq=n*n;
if(n==sq%(Math.pow(10,c)))
{
System.out.println(n+" is an automorphic number");
}
else
{
System.out.println(n+" is not an automorphic number");
}
}
}