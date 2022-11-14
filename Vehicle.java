class collision extends Exception
{
public collision(String str)
{
super(str);
}
}
public class Vehicle
{
static void check(int a,int b) throws collision
{
if(a==1&&b==1)
throw new collision("Collision will happen");
else
System.out.println("No collision");
}
public static void main(String[] args)
{
try
{
check(0,0);
check(0,1);
check(1,1);
}catch(collision e)
{
System.out.println(e);
}
}
}