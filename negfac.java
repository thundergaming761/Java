class negativefactorial extends Exception
{
public negativefactorial(String s)
{
super(s);
}
}
public class negfac
{
static void check(int x) throws negativefactorial
{
if(x<0)
throw new negativefactorial("Cannot find factorial of a negative number");
else
{
int f=1;
for(int i=1;i<=x;i++)
{
f=f*i;
}
System.out.println(f);
}
}
public static void main(String[] args)
{
try
{
check(4);
check(5);
check(-1);
}
catch(negativefactorial e)
{
System.out.println(e);
}
}
}