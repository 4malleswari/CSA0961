import java.util.*;
class swapping1
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      int a,b,temp;
      System.out.println("enter the a value");
      a=sc.nextInt();
      System.out.println("enter the b value");
      b=sc.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("After swapping:"+a);
      System.out.println("After swapping:"+b);
      }
}