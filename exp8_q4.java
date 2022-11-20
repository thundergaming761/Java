import java.util.*;
public class exp8_q4
{
public static void main(String[] args)
{
int flag=0;int c=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string");
String s = sc.nextLine();
s = s.toLowerCase();
for(int i = 0;i<s.length();i++)
{
char ch = s.charAt(i);
if(ch=='a')
{
flag=1;
}
}
if(flag == 1)
{
System.out.println("a is present");
System.out.println("Positions of occurances of a");
for(int i = 0;i<s.length();i++)
{
char ch = s.charAt(i);
if(ch=='a')
{
c++;
System.out.print((i+1)+" ");
}
}
System.out.println("\nCount = "+c);
}
else if(flag==0)
{
System.out.println("a is not present");
}
}
}
