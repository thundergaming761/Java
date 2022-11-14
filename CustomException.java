class below500 extends Exception
{
public below500(String str)
{
super(str);
}
}
public class CustomException
{
static void check(int x) throws below500
{
if(x<500)
throw new below500("Invalid input");
else
System.out.println("Valid");
}
public static void main(String[] args)
{
try
{
check(100);
check(501);
}catch(below500 e)
{
System.out.println("Exception caught");
System.out.println("Exception occured "+e);
}
}
}