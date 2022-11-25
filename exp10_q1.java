import java .util.*;
public class exp10_q1
{
public static void main(String[] args)
{
ArrayList <String> al = new ArrayList <String>();
System.out.println("First array list");
al.add("Hello");
al.add("Hi");
al.add("Bye");
al.add("Thanks");
Iterator itr = al.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
ArrayList <String> al1 = new ArrayList <String>();
for(int i = al.size()-1;i>=0;i--)
al1.add(al.get(i));
System.out.println("Second array list");
for(int i = 0;i<al1.size();i++)
System.out.println(al1.get(i));
}
}