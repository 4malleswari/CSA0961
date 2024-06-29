import java.util.*;

public class vowel {
	public static void main(String[] args)
	
	{
		String s1;
                int count = 0;
                Scanner sc=new Scanner(System.in);
                System.out.println("enter string:");
                s1=sc.nextLine();
                for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e'
				|| s1.charAt(i) == 'i'
				|| s1.charAt(i) == 'o'
				|| s1.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println(
			"Total no of vowels in string are: " + count);
	}
}
