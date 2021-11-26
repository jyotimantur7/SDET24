package githubpPactice;

public class swapingOfStringWithout3Variable {
public static void main(String[] args) {
	String s1="jyo";
	String s2="ti";
	s1=s1+s2;//jyoti
	s2=s1.substring(0,s1.length()-s2.length());//jyo
	s1=s1.substring(s2.length());
	System.out.println(s1);
	System.out.println(s2);
}
}
