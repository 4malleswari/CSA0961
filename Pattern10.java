class Pattern10
{ 
      public static void main(String arg[])
      {
      int i,j,k,n=3;
      for(i=0;i<=n;i++)
      {
      for(k=0;k<=i;k++)
      {
      System.out.print(" ");
      }
      for(j=0;j<=n-i+1;j++)
      {
      System.out.print(" * ");
      }
      System.out.println();
      }
      }
}