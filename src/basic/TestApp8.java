package basic;

import java.util.Scanner;

public class TestApp8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int no = sc.nextInt();//29

		boolean factFlag = true;
		
		for(int i=2;i<6;i++) //[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,...30]
		{
			if(no%i==0) 
			{
				factFlag = false;
				break;
			}
		}
		if(factFlag)// true 
		{
			System.out.println("No is Prime : " + no);
		}else
		{
			System.out.println("No is not Prime : " + no);
		}
	}
}