import java.util.*;
class fahrenheit1
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      double celsius,fahrenheit;
      System.out.println("enter the celsius");
      celsius=sc.nextDouble();
      fahrenheit=(celsius*1.8)+32;
      System.out.println("celsius to fahrenheit:"+fahrenheit);
      }
}
