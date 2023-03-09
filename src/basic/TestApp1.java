// define package -- optional
package basic;

// 2) import statements --- BuiltIn class

// String,System --- class
public class TestApp1 
{
	// 1) Instance Variables--- Data Members
	int no1,no2,ans;
	String name;
	// 2) Member Function
	public static void main(String args[]) 
	{
		TestApp1 obj = new TestApp1();// Java Default Constructor----no1=0,no2=0,ans=0 name--null

		System.out.println("obj.no1 : "+obj.no1);
		System.out.println("obj.no2 : "+obj.no2);
		System.out.println("obj.ans : "+obj.ans);
		
		
		obj.ans = obj.no1 + obj.no2;
		
		
	}
}
