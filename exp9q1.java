class Mythread1 implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
System.out.println("Thread 1 is running");
}
}
class Mythread2 implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
System.out.println("Thread 2 is running");
}
}
public class exp9q1
{
public static void main(String[] args)
{
Thread t1=new Thread(new Mythread1());
Thread t2=new Thread(new Mythread2());
t1.start();
t2.start();
}
}