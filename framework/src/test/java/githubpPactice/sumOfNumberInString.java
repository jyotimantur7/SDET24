package githubpPactice;

public class sumOfNumberInString {
public static void main(String[] args) {
	String s="146ab1ojh42$k";
	int sum=0;
	int gnum=0;
	for(int i=0;i<s.length();i++) 
	{
		if(s.charAt(i)>=48 && s.charAt(i)<=57)
		{
			int n=s.charAt(i)-48;
            	gnum=gnum*10+n;
		}else
		{
			sum=sum+gnum;
			gnum=0;
		}
	}
		
	System.out.println(gnum+sum);	
}
}
