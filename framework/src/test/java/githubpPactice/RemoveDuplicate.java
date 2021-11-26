package githubpPactice;

import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String s="Book";
		//step1:create collection and add all the char of given string into set
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		//step2:compare each char of set with all the char of gievn string
		System.out.println(set);
	}

}


