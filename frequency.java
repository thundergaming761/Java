import java.util.*;
public class frequency
{
public static void main(String[] args)
{
int c=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string");
String s=sc.nextLine();
s=s.toLowerCase();
for(char i='a';i<='z';i++)
{
for(int j=0;j<s.length();j++)
{
if(i==s.charAt(j))
{
c++;
}
}
if(c!=0)
{
System.out.println(i+" = "+c);
c=0;
}
}
}
}