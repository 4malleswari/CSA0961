class Fibonacci extends Thread
{
public void run()
{
int num1=0;
int num2=1;
System.out.println("Fibonacci series:");
for(int i=0;i<=10;i++)
{
System.out.println(num1+"");
int sum=num1+num2;
num1=num2;
num2=sum;
}
}
}
class Reverse extends Thread
{
public void run()
{
for(int i=10;i>=1;i--)
{
System.out.println("Reverse:"+i);
}
}
}
class R192211434VIII
{
public static void main(String arg[])
{
Fibonacci obj=new Fibonacci();
Reverse obj1=new Reverse();
obj.start();
obj1.start();
}
}