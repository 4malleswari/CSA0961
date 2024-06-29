class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("5 X"+i+"="+(5*i));
}
}
}
class B extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("10 X"+i+"="+(10*i));
}
}
}
class Table
{
public static void main(String arg[])
{
A obj1=new A();
B obj2=new B();
obj1.start();
obj2.start();
}
}