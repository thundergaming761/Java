class nonnumeric extends Exception
{
public nonnumeric(String str)
{
super(str);
}
}
public class exp7q2
{
static void check(String x)throws nonnumeric
{
int f=0;
for(int i=0;i<x.length();i++)
{
if(Character.isDigit(x.charAt(i))==false)
{
f=1;
throw new nonnumeric("Enter a numeric number");
}
}
if(f==0)
System.out.println("Valid");
}
public static void main(String[] args)
{
try
{
check("10");
check("Hello");
}catch(nonnumeric e)
{
System.out.println("Exception caught");
System.out.println("Exception occured "+e);
}
}
}