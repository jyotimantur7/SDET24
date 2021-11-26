package githubpPactice;

public class StringMinLength 
    {
	public static void main(String[] args) 
	{
	String s[]= {"hi","hello","bye","p","J","mango"};
	String min=s[0];
	for(int i=1;i<s.length;i++)
	{
		if(s[i].length()<min.length())
		{
			min=s[i];
		}
	}
    for(int i=0;i<s.length;i++)
	{
		if(min.length()==s[i].length())
		{
			System.out.println(s[i]);
		}
	}

}
}
