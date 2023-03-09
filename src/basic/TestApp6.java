package basic;

import java.util.Scanner;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below Choice : ");
		System.out.println("1) For Gujarati Menu");
		System.out.println("2) For SI Menu Menu");
		System.out.println("3) For Chinese Menu");
		System.out.println("4) For Marathi Menu");
		System.out.println("5) For Rajasthani Menu");
		int choice = sc.nextInt();
		int total=0;
		switch (choice) 
		{
			case 1: // Gujarati Menu
					System.out.println("Select Gujarati Menu :: ");
					System.out.println("1)  For Dal(1*100)");
					System.out.println("2)  For Bhat(1*50)");
					System.out.println("3)  For Kadhi(1*60)");
					int gujChoice = sc.nextInt();
					
					switch(gujChoice) 
					{
							case 1 : System.out.println("How many Dal Qty you want : ");
							         int qty = sc.nextInt();
							         total = total + (qty*100);
							         System.out.println("Total Bill : " +total);
									break;
							case 2 :
									break;
							case 3 :
									break;
					}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				break;
		}
		
		
		
	}
}
