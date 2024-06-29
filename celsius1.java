import java.util.*;
class celsius1
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      double celsius,fahrenheit;
      System.out.println("enter the fahrenheit");
      fahrenheit=sc.nextDouble();
      celsius=(fahrenheit-32)*0.55;
      System.out.println("fahrenheit to celsius:"+celsius);
      }
}
