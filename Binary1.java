import java.util.*;
class Binary1
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
int n, d = 0, count = 0;
System.out.println("Enter the binary number");
n = sc.nextInt();
while (n != 0)
{
d += (n % 10) * Math.pow(2, count);
n /= 10;
count++;
}
System.out.println("Decimal value: " + d);
int Number = d; 
String octalValue = "";
while (Number != 0) {
octalValue = (Number % 8) + octalValue;
Number /= 8;
}
System.out.println("Octal value: " + octalValue);
}
}