class Prime
{
      public static void main(String arg[])
      {
       int i,n;
       n=4;
       for(i=2;i<=10;i++)
       {
       if(n%i==0)
       {
       System.out.println("composite number");
       break;	
       }   
       else
       {
       System.out.println("prime number");
       break;
       }
       }
      }
}       