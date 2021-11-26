package githubpPactice;

import java.util.HashSet;

public class removeDuplicateWord {
	public static void main(String[] args) {
		String s="welcome to karnatak welcome";
		String str[]=s.split(" ");
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		System.out.println(set);
	}
}
