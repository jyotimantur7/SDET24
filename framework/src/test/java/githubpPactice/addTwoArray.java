package githubpPactice;

public class addTwoArray {

	public static void main(String[] args) {
		int a[]= {1,3,5};
		int b[]= {2,4,6,8,56,86};
		int sum=0;
		int count=a.length;
		if(count<b.length)
		{
			count=b.length; 
		}
		for(int i=0;i<count;i++)
		{
			try {
				sum=a[i]+b[i];
				System.out.println(sum);
			    }
		   catch(Exception e) 
			    {
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}else
				{
					System.out.println(b[i]);
				}
			    }
		}

	}

}
