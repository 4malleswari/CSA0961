import java.util.*;
class Reversestr
{
      public static void main(String arg[])
      {
      String s1;
      String rev=" ";
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string:");
      s1=sc.nextLine();
      int n=s1.length();
      for(int i=n-1;i>=0;i--)
      {
      ch=s1.charAt(i);
      rev=rev+ch;
      }
      System.out.println(rev);
      }
}