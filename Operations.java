import java.util.*;
class Operations
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String inputString=sc.nextLine();
	String replacedString=inputString.replace("Saveetha","Wonderful
");
	int length=inputString.length();
	String uppercaseString=inputString.toUpperCase();
	System.out.println("Replaced string="+replacedString);
	System.out.println("length of the string="+length);
	System.out.println("uppercase string="+uppercaseString);
	}
}