package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastex()
	{
		System.out.println("i will execute last");	
		System.out.println("shgdhs");
		System.out.println("sgfdh");
		System.out.println("home");


	}
	
@Test(groups="{smoke}")
	public void Demo()
	{
System.out.println("hello");
System.out.println("hellosd");

	
	}
@Test
public void SecondTest()
{
	System.out.println("bye");
}
}
