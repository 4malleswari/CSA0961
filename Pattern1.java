class Pattern1
{ 
      public static void main(String arg[])
      {
      for(int i=0;i<=5;i++)
      {
      for(int j=0;j<2*i;j++)
      {
      System.out.print(" ");
      }
      for(int k=0;k<2*5-(i);k++)
      {
      System.out.print("*");
      }
      System.out.println(" ");
      }
      }
}