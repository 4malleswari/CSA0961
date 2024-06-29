import java.util.*;
class division
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      int remainder,divisor,dividend;
      double quotient;
      System.out.println("enter the divisor value");
      divisor=sc.nextInt();
      System.out.println("enter the dividend value");
      dividend=sc.nextInt();
      quotient= dividend/divisor;
      remainder=dividend%divisor;
      System.out.println("quotient:"+quotient);
      System.out.println("remainder:"+remainder);
      }
}