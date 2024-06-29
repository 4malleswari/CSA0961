class Armstrong
{
      public static void main(String arg[])
      {
      int n=153,rem,rev=0,x=n;
      while(n!=0)
      {
      rem=n%10;
      rev=rev+rem*rem*rem;
      n=n/10;
      }
      if(x==rev)
      {
      System.out.println("It is a Armstrong");
      }
      else
      { 
      System.out.println("It is not a Armstrong");
      }
      }
}