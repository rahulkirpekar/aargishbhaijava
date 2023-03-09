package basic;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		int i=1;
		for (; i <= 10;) 
		{
			System.out.println("I : " + i++);
		}
//		System.out.println("Outer I : " + i);// Undefined symbol
	}
}
