package githubpPactice;

public class sumOfEachDigitInString {
public static void main(String[] args) {
	String s="abc123kj78";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		
		//asci value of 0=48 and 9=57
		if(s.charAt(i)>='0' && s.charAt(i)<='9')
		{
		int n=s.charAt(i)-48;
		sum=sum+n;
		}
	}
	System.out.println(sum);
}
}
