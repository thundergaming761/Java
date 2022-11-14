import java.util.*;
class Trunk_calls
{
double bill;
double duration;
double rate;
}
class Urgent extends Trunk_calls
{
void display()
{
bill=rate*duration;
System.out.println("The bill for urgent call is "+bill);
}
}
class Ordinary extends Trunk_calls
{
void display()
{
bill=rate*duration;
System.out.println("The bill for ordinary call is "+bill);
}
}
class Lightning extends Trunk_calls
{
void display()
{
bill=rate*duration;
System.out.println("The bill for ordinary call is "+bill);
}
}
public class ExecuteTrunkCalls
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("1. Urgent call\n2. Ordinary call\n3. Lightning Call\n4. Exit");
System.out.println("Enter your choice");
int ch= sc.nextInt();
switch(ch)
{
case 1:
Urgent u=new Urgent();
System.out.println("Enter rate");
u.rate=sc.nextDouble();
System.out.println("Enter duration");
u.duration=sc.nextDouble();
u.display();
break;
case 2:
Ordinary o=new Ordinary();
System.out.println("Enter rate");
o.rate=sc.nextDouble();
System.out.println("Enter duration");
o.duration=sc.nextDouble();
o.display();
break;
case 3:
Lightning l=new Lightning();
System.out.println("Enter rate");
l.rate=sc.nextDouble();
System.out.println("Enter duration");
l.duration=sc.nextDouble();
l.display();
break;
case 4:
System.exit(0);
break;
default:
System.out.println("Invalid choice");
}
}
}