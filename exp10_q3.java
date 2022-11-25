import java.util.*;
public class exp10_q3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
ArrayList <String> al = new ArrayList<String>();
al.add("Hello");
al.add("Hi");
al.add("Bye");
al.add("Thanks");
HashSet <String> hs = new HashSet<String>();
hs.addAll(al);
System.out.println(hs);
System.out.println("Enter a string");
String t = sc.nextLine();
if(hs.contains(t))
System.out.println(t+" is present");
else
System.out.println(t+" is not present");
hs.clear();
System.out.println(hs);
}
}