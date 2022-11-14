import java.util.*;
public class vowels
{
public static void main(String[] args)
{
int c=0;int c1=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String s=sc.nextLine();
s=s.toLowerCase();
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if((ch=='a')||(ch== 'e')||(ch== 'i')||(ch== 'o')||(ch== 'u'))
{
c++;
}
else if(!((ch=='a')&&(ch== 'e')&&(ch== 'i')&&(ch== 'o')&&(ch== 'u'))&&ch!=' ')
{
c1++;
}
}
System.out.println("The number of vowels present in the string are "+c);
System.out.println("The number of consonants present in the string are "+c1);
}
}
