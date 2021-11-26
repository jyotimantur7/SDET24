package githubpPactice;

public class FirstMaximum {

	public static void main(String[] args) {
	
			int a[]= {20,40,60,70,80};
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int i=0;i<1;i++)
			{
				System.out.println("fisrt maximum value  "+a[0]);
			}

	}

}
