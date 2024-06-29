import java.util.*;
class Sum
{
      public static void main(String arg[])
      {
      Scanner sc=new Scanner(System.in);
      int a[]=new int[10];
      int n,i,sum;
      System.out.println("enter the number of array");
      n=sc.nextInt();
      System.out.println("enter the values");
      for(i=0;i<n;i++)
      {
      a[i]=sc.nextInt();
      }
      sum=0;
      for(i=0;i<=n;i++)
      {
      sum=sum+a[i];
      }
      System.out.println("Sum of number"+sum);
      }
}



