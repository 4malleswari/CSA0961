import java.util.*;
class Vote
{
      public static void main(String arg[])
      { 
       Scanner sc=new Scanner(System.in);
       int age,eligible;
       System.out.println("enter age");
       age=sc.nextInt();
       if(age>=18)
       { 
           System.out.println("Eligible to vote");
       }
       else
       {
           System.out.println("Not eligible to vote");
           System.out.println("Eligible after:"+(18-age));
       }
       }
}