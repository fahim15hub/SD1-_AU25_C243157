import java.util.*;
public class Main
{
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String arr = sc.nextLine();
		String s = "aeiouAEIOU";
		int c = 0;
		for(int i =0; i<arr.length(); i++)
		{
			for(int j = 0; j<10; j++)
			{
				if(arr.charAt(i)==s.charAt(j)) c++;
				}
			}
		System.out.println("Vowels: "+c);
		System.out.println("Consonant: "+(arr.length()-c));
		
	}
}