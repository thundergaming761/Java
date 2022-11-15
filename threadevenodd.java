class Mythread1 extends Thread
{
public void run()
{
for(int i=1;i<=20;i++)
{
if(i%2==0)
System.out.println(i);
}
}
}
class Mythread2 extends Thread
{
public void run()
{
for(int i=1;i<=20;i++)
{
if(i%2!=0)
System.out.println(i);
}
}
}
public class threadevenodd
{
public static void main(String[] args)
{
Mythread1 t1 = new Mythread1();
Mythread2 t2 = new Mythread2();
t1.start();
t2.start();
}
}