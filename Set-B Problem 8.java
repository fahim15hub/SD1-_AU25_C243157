import java.util.*;
public class Main
{
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String arr = sc.nextLine();
		StringBuilder ar = new StringBuilder(arr);
		ar.reverse();
			if(arr.equals(ar.toString())) System.out.println("This word is  palindrome");
			else System.out.println("This word is not palindrome");
			
	}
}