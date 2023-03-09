package basic;
import java.util.Scanner;
public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		int no1,no2,ans;
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();
		
		System.out.println("Enter below choice : ");
		System.out.println("1) for Addition ");
		System.out.println("2) for Subtraction ");
		System.out.println("3) for Multiply ");
		System.out.println("4) for Division ");
		int choice = sc.nextInt();
		
		switch (choice) 
		{
			case 1:ans = no1+no2;
					System.out.println("Addition : " + ans);
				   break;
			case 2: ans = no1-no2;
			
					System.out.println("Subtraction : " + ans);
					break;
			case 3: ans = no1*no2;
					System.out.println("Multiply : " + ans);
					break;
			case 4:
					ans = no1/no2;
					System.out.println("Division : " + ans);
					break;
			default: System.out.println("Invalid Choice,\n\t Please enter between 1 to 4 choice");
				break;
		}
	}
}