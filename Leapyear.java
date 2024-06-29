import java.util.*;
class Leapyear
{
      public static void main(String arg[])
      { 
       Scanner sc=new Scanner(System.in);
       int year;
       System.out.println("enter year");
       year=sc.nextInt();
       if(year%4==0)
       { 
           System.out.println("leap year");
       }
       else
       {
           System.out.println("Not leap year");
       }
       }
}