import java.util.*;
public class noofchar
{
public static void main(String[] args)
{
int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String s=sc.nextLine();
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch!=' ')
{
c++;
}
}
System.out.println("The number of characters in the string are "+c);
}
}