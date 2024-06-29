class R192211434I
{
      public static void main(String arg[])
      {
      String s1="TEMPLE";
      String rev=" ";
      char ch;
      int n=s1.length();
      for(int i=n-1;i>=0;i--)
      {
      ch=s1.charAt(i);
      rev=rev+ch;
      }
      System.out.println(rev);
      }
}