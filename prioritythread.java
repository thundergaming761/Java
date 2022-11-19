class Mythread implements Runnable
{
public synchronized void run()
{
if(Thread.currentThread().getPriority()==9||Thread.currentThread().getPriority()==8)
{
try
{
Thread.sleep(3000);
}
catch(Exception e)
{
System.out.println(e);
}
if(Thread.currentThread().isAlive())
System.out.println("Alive");

}
System.out.println("Thread "+Thread.currentThread().getName()+" entered");
System.out.println("Thread "+Thread.currentThread().getName()+" exited");
}
}
public class prioritythread
{
public static void main(String[] args)
{
Mythread r1 = new Mythread();
Thread t1 = new Thread(r1,"A");
Thread t2 = new Thread(r1,"B");
Thread t3 = new Thread(r1,"C");
Thread t4 = new Thread(r1,"D");
Thread t5 = new Thread(r1,"E");
t1.setPriority(9);
t2.setPriority(8);
t3.setPriority(1);
t4.setPriority(2);
t5.setPriority(3);
System.out.println("Priority of A : "+t1.getPriority());
System.out.println("Priority of B : "+t2.getPriority());
System.out.println("Priority of C : "+t3.getPriority());
System.out.println("Priority of D : "+t4.getPriority());
System.out.println("Priority of E : "+t5.getPriority());
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();

}
}