package githubpPactice;

public class seperateCharSpecialCharDigit {

	public static void main(String[] args) {
	String s="a1b$c2%";
	String alpha="";
	String number="";
	String special="";
	for(int i=0;i<s.length();i++)
	{
		if(Character.isAlphabetic(s.charAt(i)))
				{
			    alpha=alpha+s.charAt(i);
				}
		else if(Character.isDigit(s.charAt(i)))
		{
			number=number+s.charAt(i);
		}
		else
		{
			special=special+s.charAt(i);
		}
	}
	System.out.println(alpha);
	System.out.println(special);
	System.out.println(number);
	}

}
