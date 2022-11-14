abstract class shape
{
abstract void draw();
}
class rectangle extends shape
{
void draw()
{
System.out.println("Drawing rectangle");
}
}
class circle extends shape
{
void draw()
{
System.out.println("Drawing circle");
}
}
public class sample
{
public static void main(String[] args)
{
circle c=new circle();
c.draw();
rectangle r=new rectangle();
r.draw();
}
}