class Mythread1 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
System.out.println("Thread 1 is running");
}
}
class Mythread2 extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
System.out.println("Thread2 is running");
}
}
public class exp9_q1
{
public static void main(String[] args)
{
Mythread1 t1=new Mythread1();
Mythread2 t2=new Mythread2();
t1.start();
t2.start();
}
}