import java.util.*;
class circle
{
      public static void main(String arg[])
      {
       Scanner sc=new Scanner(System.in);
       int r;
       double area,pi;
       System.out.println("enter the r value");
       r=sc.nextInt();
       System.out.println("enter the pi value");
       pi=sc.nextDouble();
       area=pi*r*r;
       System.out.println("Area of circle:"+area);
      }
}