import java.util.*;
class Oddoreven
{
      public static void main(String arg[])
      { 
       Scanner sc=new Scanner(System.in);
       int a;
       System.out.println("enter a value");
       a=sc.nextInt();
       if(a%2==0)
       { 
           System.out.println("It is a even number");
       }
       else
       {
           System.out.println("It is a odd number");
       }
       }
}