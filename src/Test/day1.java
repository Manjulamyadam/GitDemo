package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void lastex()
	{
		System.out.println("i will execute last");	
		System.out.println("shgdhs");
	}
	
@Test(groups="{smoke}")
	public void Demo()
	{
System.out.println("hello");
	
	}
@Test
public void SecondTest()
{
	System.out.println("bye");
}
}
