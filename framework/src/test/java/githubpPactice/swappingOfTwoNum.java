package githubpPactice;

import org.testng.reporters.jq.Main;

public class swappingOfTwoNum {
public static void main(String[] args) {
	int a=30;
	int b=78;
	System.out.println("before swapping  "+a+"---"+b);
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("after swapping "+a+"----"+b);

}
}
