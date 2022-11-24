public class wrapper1
{
public static void main(String[] args)
{
int i = 10;
Integer intobj = new Integer(i);
System.out.println("Integer object : "+i);
String s = Integer.toString(intobj);
System.out.println("String object : "+s);
int j = Integer.parseInt(s);
System.out.println("int : "+j);
String s1 = Integer.toString(j);
System.out.println("String object : "+s1);
int k = Integer.parseInt(s1);
System.out.println("Integer object : "+k);
int l = (int) k;
System.out.println("int : "+k);
}
}