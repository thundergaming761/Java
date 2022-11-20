class Mythread implements Runnable
{
public void run()
{
System.out.println(Thread.currentThread().getName()+" running");
for(int i=5;i>0;i--)
{
System.out.println(Thread.currentThread().getName()+" : "+i);
}
System.out.println(Thread.currentThread().getName()+" exiting");
}
}
public class sample
{
public static void main(String[] args)
{
Mythread r1 = new Mythread();
Thread t1 = new Thread(r1,"Thread 1");
Thread t2 = new Thread(r1,"Thread 2");
Thread t3 = new Thread(r1,"Thread 3");
System.out.println(t1.getName()+" priority "+t1.getPriority());
System.out.println(t2.getName()+" priority "+t2.getPriority());
System.out.println(t3.getName()+" priority "+t3.getPriority());
t1.setPriority(6);
t2.setPriority(3);
t3.setPriority(9);
System.out.println("New "+t1.getName()+" priority "+t1.getPriority());
System.out.println("New "+t2.getName()+" priority "+t2.getPriority());
System.out.println("New "+t3.getName()+" priority "+t3.getPriority());
t1.start();
t2.start();
t3.start();
}
}