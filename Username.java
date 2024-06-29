import java.util.*;
class Username
{
      public static void main(String arg[])
      {
       String S1;
       String S2;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter username:");
       S1=sc.nextLine();
       System.out.println("Reenter username:");
       S2=sc.nextLine();
       if(S1.equals(S2))
       {
       System.out.println("Valid");
       }
       else
       {             
       System.out.println("InValid");
       }
      }
}