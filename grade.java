import java.util.*;
public class grade
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[] a=new int[10];
String[] b=new String[10];
System.out.println("Enter the marks of 10 students");
for(int i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<10;i++)
{
for(int j=0;j<10-i-1;j++)
{
if(a[j]>a[j+1])
{
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
for(int i=0;i<10;i++)
{
if(a[i]<45)
b[i]="FAIL";
else if(a[i]>=40&&a[i]<=50)
b[i]="PASS";
else if(a[i]>=51&&a[i]<=75)
b[i]="MERIT";
else
b[i]="DISTINCTION";
}
for(int i=0;i<10;i++)
{
System.out.println(a[i]+"\t"+b[i]);
}
}
}