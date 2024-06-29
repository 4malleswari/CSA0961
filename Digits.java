class Digits
{
      public static void main(String arg[])
      {
      int n=101,rem,num=0;
      while(n!=0)
      {
      rem=n%10;
      num=num+rem;
      n=n/10;
      System.out.println(+num);
      }
      System.out.println("Number:"+num);
      }
}