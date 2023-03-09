package basic;

import java.util.Scanner;

public class TestApp9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter No : ");
		int no = sc.nextInt();// 1234
		int sum = 0;
		 //  123 > 8  
		//   12 > 0
		//   1 > 0
		//   0 > 0
		for(;no > 0; ) 
		{
		//       3    123 % 10
		//       2      12 % 10	 
		//       1       1 % 10	
			int temp = no % 10;// 3---123 % 10
		//   3     0 + 3	
		//	 5      3 + 2
		//   6      5 + 1	
			sum = sum+temp;// 3 = 0 + 3
		//  12    123/10	
		//  1     12/10	
		//  0     1/10	
			no /= 10; //;// 12   --- [no = no / 10]
		}
		System.out.println("SUm of Digit : "+sum);
	}
}
