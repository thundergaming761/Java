public class wrapper2
{
public static void main(String[] args)
{
float i = 10.05f;
Float floatobj = new Float(i);
System.out.println("Float object : "+i);
String s = Float.toString(floatobj);
System.out.println("String object : "+s);
float j = Float.parseFloat(s);
System.out.println("float : "+j);
String s1 = Float.toString(j);
System.out.println("String object : "+s1);
float k = Float.parseFloat(s1);
System.out.println("Float object : "+k);
float l = (float) k;
System.out.println("float : "+k);
}
}