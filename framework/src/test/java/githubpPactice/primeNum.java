package githubpPactice;

public class primeNum {

	public static void main(String[] args) {
		int n=19;
		boolean flag =true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
if(flag==true)
{
	System.out.println("it is prime number ");
}else
{
	System.out.println("it is not prime number ");
}
	}

}
