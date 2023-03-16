package basic;

public class TestApp12 
{
	public static void main(String[] args) 
	{
//		int a[] = {5,4,3,2,1};
//		for(int temp : a) 
//		{
//			System.out.println(temp);
//		}
		Student s[] = new Student[5];

		// scan s[]---
		
		
		for(Student obj : s) 
		{
			obj.disp();
		}
	}
}
