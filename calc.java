public class calc
{
public static void main(String[] args)
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[2]);
if(args[1].equals("+"))
System.out.println("Sum= "+(a+b));
else if(args[1].equals("-"))
System.out.println("Subtraction= "+(a-b));
else if(args[1].equals("#"))
System.out.println("Multiplication= "+(a-b));
else if(args[1].equals("/"))
System.out.println("Division= "+(a/b));
else if(args[1].equals("%"))
System.out.println("Remainder= "+(a%b));
}
}