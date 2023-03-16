package oops.clobjtopic;

//		     Object(toString())--14
//			    |
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		System.out.println(s1 + " "+s1.toString());
		// Object---->s1.toString()
		// FullQuaClassName@[HexaString[HesCode]]

		// s - reference(STACK) Variable of Student type
		// Student - Object--HEAP
		// new ---> objects--HEAP
		
		System.out.println(s1 +" - "+s1.rno + " "+s1.name + " "+s1.std);
		System.out.println(s2 +" - "+s2.rno + " "+s2.name + " "+s2.std);
		System.out.println(s3 +" - "+s3.rno + " "+s3.name + " "+s3.std);
		System.out.println(s4 +" - "+s4.rno + " "+s4.name + " "+s4.std);
		System.out.println(s5 +" - "+s5.rno + " "+s5.name + " "+s5.std);
		
	}
}
