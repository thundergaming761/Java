import java.util.*;
public class sunny
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
double sr=Math.sqrt(n+1);
String s=sr+"";
String s1=s.substring(s.indexOf(".")+1);
if(Long.parseLong(s1)>0)
{
System.out.println(n+" is not a sunny number");
}
else
{
System.out.println(n+" is a sunny number");
}
}
}