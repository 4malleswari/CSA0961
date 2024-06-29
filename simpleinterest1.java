import java.util.*;
class simpleinterest1
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      double SI,r;
      int p,t;
      System.out.println("enter the p value");
      p=sc.nextInt();
      System.out.println("enter the t value");
      t=sc.nextInt();
      System.out.println("enter the r value");
      r=sc.nextDouble();
      SI=p*t*r/100;
      System.out.println("Simple Interest:"+SI);
      }
}