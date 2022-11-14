import java.util.*;
public class copyelements
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the arrray");
int n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.println("Enter the elements of the array");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
b[i]=a[i];
}
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
for(int i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}
}
}