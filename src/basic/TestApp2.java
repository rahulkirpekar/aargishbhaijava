package basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int no1,no2,ans;
		
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();// 20
		System.out.println("Enter No2 : ");
		no2 = sc.nextInt();// 20
		
		
		// operation

		ans = no1 + no2;
		

		//  string  +  string  = concatenation
		//  string  +  int = concatenation
		
		//  string  +  int + int = concatenation
		//    "add" + 20 + 10 add2010

		// int + int = arithmetic operators
		// int  + int + string 
		//  10   + 20  + "add" = 30add

		System.out.println("Addition : " + ans);
		
	}
}
