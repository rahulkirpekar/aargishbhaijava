package basic;

import java.util.Scanner;

public class TestApp3 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int no;
		System.out.println("Enter No : ");
		no = new Scanner(System.in).nextInt();
		// ladder if..else
		if (no > 0) 
		{
			System.out.println("No is Positive : " + no);
		}else if(no < 0)
		{
			System.out.println("No is Negative : " + no);
		} else if(no==0)
		{
			System.out.println("No is ZERO : " + no);
		}
	}
}
