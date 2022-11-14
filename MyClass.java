interface A
{
void meth1();
void meth2();
}
public class MyClass implements A
{
public void meth1()
{
System.out.println("I am method 1");
}
public void meth2()
{
System.out.println("I am method 2");
}
public static void main(String[] args)
{
MyClass obj=new MyClass();
obj.meth1();
obj.meth2();
}
}