package githubpPactice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueChar {
	public static void main(String[] args) {
		String s="Book";
		//step1:create collection and add all the char of given string into set
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		//step2:compare each char of set with all the char of gievn string
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
				
			{
				if(ch==s.charAt(i))
				{
					//step3:if char is matching ,innocent the count
					count++;
				}
				
			}
			//step4:print both character and count ,which are unique and given order
			if(count==1) {
			System.out.println(ch+"--"+count);
			}
		}

	}

}


