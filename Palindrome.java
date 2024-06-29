class Palindrome
{
      public static void main(String arg[])
      {
      int n=121,rem,rev=0,x=n;
      while(n!=0)
      {
      rem=n%10;
      rev=(rev*10)+rem;
      n=n/10;
      }
      if(x==rev)
      {
      System.out.println("It is a palindrome");
      }
      else
      { 
      System.out.println("It is not a palindrome");
      }
      }
}