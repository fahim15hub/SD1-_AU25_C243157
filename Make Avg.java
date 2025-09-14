import java.util.*;
public class Main
{
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		c = sc.nextInt();
		b= (a+c)/2;
		if((a+c)%2==0) System.out.println("Int B exist and it’s "+b);
		else System.out.println("Int B doesnot exist");
	
		
	}
}