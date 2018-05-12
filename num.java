import java.util.*;
import java.io.*;
class num
{
public static void main(String arg[])
{
int n;
int a[]=new int[n];
Scanner sc=new Scanner(System.in);
System.out.print("Enter the array size:");
n=sc.nextInt();
System.out.print("Enter the array elements:");
a[]=sc.nextInt();
for(int i=0;i<5;i++)
{
for(int j=1;j<=5;j++)
{
if(a[i]==a[j])
{
System.out.print(a[i]);
}
else
{
System.out.print("Unique");
}
}
}
}
}
