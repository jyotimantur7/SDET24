package githubpPactice;

public class sumOfNumber {
	static int sump(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
	int x=568;
	int temp=x;
	while(temp>9)
	{
		temp=sump(temp);
	}
	
		System.out.println("sum of number is "+temp);
		

	}

}
