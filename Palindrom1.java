class strings extends Thread
{
public void run() 
{
int i;
String rev = "";
char ch;
String a = "mom
";
int n = a.length();
for (i = n - 1; i >= 0; i--) {
ch = a.charAt(i);
rev = rev + ch;
}
System.out.println("String is: " + a);
System.out.println("Reversed String is: " + rev);
if(rev.equals(a))
{
System.out.println("It is a Palindrom");
}
else
{
System.out.println("It is not a Palindrom");
}
}
}
class number extends Thread 
{
public void run()
{
int n = 555, rev = 0, rem,x=n;
while (n != 0) {
rem = n % 10;
 rev = rev * 10 + rem;
 n = n / 10;
}
System.out.println("Reversed number is:" + rev);
if(x==rev)
{
System.out.println("It is a Palindrom");
}
else
{
System.out.println("It is not a Palindrom");
}
}
}
class Palindrom1 
{
public static void main(String[] args)
 {
 strings obj1 = new strings();
 number obj2 = new number();
 obj1.start();
 obj2.start();
    }
}