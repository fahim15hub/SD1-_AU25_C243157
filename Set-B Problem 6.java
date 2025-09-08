import java.util.*;
public class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of digits");
		int n = sc.nextInt();
		System.out.println("Enter the target digits");
		int t = sc.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the digits");
		boolean flag = false;
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]==t) 
			{
				System.out.println("The desired digit is found on "+(i+1)+"th index");
				flag=true;
				 break;
				}
			} 
			if(!flag) System.out.println("The desired digit is not found");
			
	}
}