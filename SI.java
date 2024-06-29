import java.util.*;
class SI
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      double SI;
      int p,t,r,n;
      System.out.println("enter the p value");
      p=sc.nextInt();
      System.out.println("enter the t value");
      t=sc.nextInt();
      System.out.println("enter the age:");
      n=sc.nextInt();
      if(n>=60)
      {
      r=12;
      }
      else 
      {
      r=10;
      }
      SI=p*t*r/100;
      System.out.println("Simple Interest:"+SI);
      }
}