package githubpPactice;

public class VowelsToLower {
	public static void main(String[] args) {
		String s="jyotiManTUR";
		String n=s.toLowerCase();
		for(int i=0;i<n.length();i++)
		{
			if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u')
			{
				System.out.println(n.charAt(i));
			}
		}
	}

}
