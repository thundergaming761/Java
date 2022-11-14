interface A
{
public static final int x=10;
}
public class exp5q3 implements A
{
public static void main(String[] args)
{
A.x=A.x+10;
System.out.println(A.x);
}
}