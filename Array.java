import java.util.*;
class Array
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0,i,Sum;
System.out.println("enter no of elements:");
n=sc.nextInt();
System.out.println("enter the elements:");
int a[]=new int[n];
try
{
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
Sum=sum+a[i];
System.out.println("Output:"+Sum);
}
catch(Exception ex)
{
System.out.println("n value is less");
System.out.println("change n value");
}
finally
{
System.out.println("Always excuted");
}
}
}