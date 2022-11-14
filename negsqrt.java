class negativesquareroot extends Exception
{
public negativesquareroot(String s)
{
super(s);
}
}
public class negsqrt
{
static void check(int x) throws negativesquareroot
{
if(x<0)
throw new negativesquareroot("Cannot find the square root of a negative number");
else
System.out.println(Math.sqrt(x));
}
public static void main(String[] args)
{
try
{
check(25);
check(16);
check(-25);
}catch(negativesquareroot e)
{
System.out.println(e);
}
}
}