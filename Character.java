import java.util.*;
class Character
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String intputString=sc.nextLine();
	System.out.println("enter the character to be searched");
	char searchChar=sc.next().charAt(0);
	int index=-1;
	for(int i=0;i<inputString.length();i++)	{
	if(inputString.charAt(i)==searchChar)
	{
	index=i;
	break;
	}
	}
	if(index!=-1)
	{
	System.out.println(searchchar+"is found in string at index"+index);
	}
	else
	{
	System.out.println(searchchar+"is not found in the string");
	}
	}
}

