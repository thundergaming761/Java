import java.util.*;
class Calc
{
long power(int a,int b)
{
return (long)(Math.pow(a,b));
}
}
public class exp7q5 extends Calc
{
void check(int a,int b) throws ArithmeticException
{
if(a<0||b<0)
throw new ArithmeticException("a or b should not be negative");
else if(a==0||b==0)
throw new ArithmeticException("a or b should not be zero");
else
System.out.println(power(a,b));
}
public static void main(String[] args)
{
exp7q5 obj=new exp7q5();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of inputs");
String s1 = sc.nextLine();
int n = Integer.parseInt(s1);
System.out.println("Enter a and b");
for(int i=1;i<=n;i++)
{
String s = sc.nextLine();
StringTokenizer st = new StringTokenizer(s);
int c = st.countTokens();
String w = st.nextToken();
int a = Integer.parseInt(w);
w = st.nextToken();
int b = Integer.parseInt(w);
try
{
obj.check(a,b);
}catch(ArithmeticException e)
{
System.out.println(e);
}
}
}
}