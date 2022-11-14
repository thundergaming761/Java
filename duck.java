import java.util.*;
public class duck
{
public static void main(String[] args)
{
int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
String s=n+"";
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if((ch=='0')&&(i!=0))
{
c++;
}
}
if(c>0)
{
System.out.println(n+" is a duck number");
}
else
{
System.out.println(n+" is not a duck number");
}
}
}