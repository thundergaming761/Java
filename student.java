import java.util.*;
public class student
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String[] name=new String[10];
String[] rno=new String[10];
System.out.println("Enter details");
for(int i=0;i<10;i++)
{
System.out.println("Enter name");
name[i]=sc.nextLine();
System.out.println("Enter roll no");
rno[i]=sc.nextLine();
}
System.out.println("Enter the index you want to access");
int t=sc.nextInt();
try
{
System.out.println("Name = "+name[t]+"\n Roll no = "+rno[t]);
}catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Invalid index");
}
}
}