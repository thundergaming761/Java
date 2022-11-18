class Mythread extends Thread
{
static int c=0;
public synchronized void increase()
{
c++;
System.out.println(c);

}
public void run()
{
increase();
}
}
public class sync
{
public static void main(String[] args)
{
for(int i=1;i<=10;i++)
{
Mythread t1 = new Mythread();
t1.start();
}
}
}