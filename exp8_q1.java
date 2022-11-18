import java.util.*;
public class exp8_q1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string");
String s = sc.nextLine();
s = s.toLowerCase();
System.out.println("Enter any character or substing");
String t = sc.nextLine();
System.out.println("First index: "+(s.indexOf(t)));
System.out.println("Last index: "+(s.lastIndexOf(t)));
}
}