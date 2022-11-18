import java.util.*;
public class exp8_q2
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string");
String s = sc.nextLine();
StringBuffer st = new StringBuffer(s);
for(int i = 0;i<st.length();i++)
{
char ch = st.charAt(i);
if(ch>='a'&&ch<='z')
{
ch = (char)(ch-32);
String c = Character.toString(ch);
st.replace(i, i + 1, c);
}
}
System.out.println(st);
}
}