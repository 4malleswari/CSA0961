import java.util.*;
class Number
{
      public static void main(String arg[])
      { 
       Scanner sc=new Scanner(System.in);
       int number;
       System.out.println("enter num");
       number=sc.nextInt();
       if(number>0)
       { 
           System.out.println("Postive Number");
       }
       else if(number==0)
       {
           System.out.println("Number is zero");
       }
       else
       {
           System.out.println("Negative Number");
       }
       }
}