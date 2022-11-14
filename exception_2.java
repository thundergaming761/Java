public class exception_2
{
public static void main(String[] args)
{
try
{
int a=100;
int b=0;
int r=a/b;
}
catch(Exception e)
{
System.out.println("Invalid "+e);
}
}
}