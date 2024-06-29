import java.util.*;
class sphere
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      double pi,volume;
      int r;
      System.out.println("enter the r value");
      r=sc.nextInt();
      System.out.println("enter the pi value");
      pi=sc.nextDouble();
      volume=1.33*pi*r*r*r;
      System.out.println("volume of sphere:"+volume);
      }
}
