package githubpPactice;

public class StringReverseCount {

	public static void main(String[] args) {
		String s="Bangalore";
		String rev="";
		int count=s.compareTo(rev);
		for(int i=(count-1);i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
System.out.println(rev);
	}

}
