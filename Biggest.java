import java.util.*;
class Biggest
{
      public static void main(String arg[])
      { 
       Scanner sc=new Scanner(System.in);
       int a,b;
       System.out.println("enter a value");
       a=sc.nextInt();
       System.out.println("enter b value");
       b=sc.nextInt();
       if(a>b)
       { 
           System.out.println("Biggest number:"+a);
       }
       else
       {
           System.out.println("Biggest number:"+b);
       }
       }
}