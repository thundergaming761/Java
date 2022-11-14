import java.util.*;
public class palindrome
{
public static void main(String[] args)
{
int rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int t=n;
while(t!=0)
{
int r=t%10;
rev=rev*10+r;
t=t/10;
}
if(rev==n)
{
System.out.println(n+" is a palindrome number");
}
else
{
System.out.println(n+" is not a palindrome number");
}
}
}