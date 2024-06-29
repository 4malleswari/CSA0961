import java.util.*;
class Fibonacci
{
      public static void main(String arg[])
      {
      int a=0,b=1,c,i,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
      c=a+b;
      a=b;
      b=c;
      System.out.println(+c);
      } 
     
      }
}