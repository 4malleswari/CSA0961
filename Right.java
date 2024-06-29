import java.util.*;
class Right
{ 
      public static void main(String arg[])
      {
       Scanner sc=new Scanner(System.in);
       int a,b,c,s;
       double area;
       System.out.println("enter the s value");
       s=sc.nextInt();
       System.out.println("enter the a value");
       a=sc.nextInt();
       System.out.println("enter the b value");
       b=sc.nextInt();
       System.out.println("enter the c value");
       c=sc.nextInt();
       area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("Area:"+area);
       }
}
