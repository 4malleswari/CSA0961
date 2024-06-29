class Palindrom2
{
      public static void main(String arg[])
      {
      String str="malayalam";
      String rev=" ";
      char ch;
      int n=str.length();
      for(int i=n-1;i>=0;i--)
       {
      ch=str.charAt(i);
      rev=rev+ch;
      }
      if(rev.equals(str))
      {
      System.out.println("Is a palindrom");
      }
      else
      {
      System.out.println("Is not a palindrom");
      }
      }
}