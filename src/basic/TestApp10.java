package basic;

public class TestApp10 
{
	public static void main(String[] args) 
	{
		int totalPrime = 0;
		for(int j=1;j<=50;j++) 
		{
			int no = j;
			int factorCount = 0;
			for(int i=1;i<=no;i++) 
			{
				if(no%i==0) 
				{
					factorCount++;
				}
			}
			if(factorCount==2) 
			{
				System.out.print(no+" ");
				totalPrime++;
			}
		}
		System.out.println("Total Prime : "+totalPrime);
	}
}
