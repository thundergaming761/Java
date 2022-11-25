import java.util.*;
public class exp10_q2
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
Map<String,Integer> m = new HashMap<String,Integer>();
m.put("Kushagra",80);
m.put("Aaditya",90);
m.put("Mukul",70);
m.put("Abhinav",90);
for(Map.Entry t : m.entrySet())
System.out.println(t.getKey()+" "+t.getValue());
System.out.println("Enter the key you want to check");
String tkey = sc.nextLine();
if(m.containsKey(tkey))
System.out.println(tkey+" is present");
else
System.out.println(tkey+" is not present");
System.out.println("Enter the value you want to check");
String tval = sc.nextLine();
if(m.containsValue(tval))
System.out.println(tval+" is present");
else
System.out.println(tval+" is not present");
}
}