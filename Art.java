import java.util.*;
class Art
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int x,a,b;
System.out.println("enter a and b value:");
a=sc.nextInt();
b=sc.nextInt();
try
{
x=a/b;
System.out.println("Output:"+x);
}
catch(Exception ex)
{
System.out.println("Division by zero is error");
System.out.println("change b value");
}
finally
{
System.out.println("Always excuted");
}
}
}
