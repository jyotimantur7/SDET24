package githubpPactice;

public class patternCharTraingle {
	public static void main(String[] args) {
		String s="Bangalore";
		String rev="";
		int count=s.compareTo(rev);
		for(int i=0;i<s.length();i++)
		{
			rev=rev+s.charAt(i);
			System.out.println(rev);
		}

	}
}
