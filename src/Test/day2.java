package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	
	@Parameters({"URL"})
	@Test(groups="{smoke}")
	public void ploan(String URL)
	{
		System.out.println("good");
		System.out.println("url is here");
	}

	
	@BeforeTest
	public void prere()
	{
		System.out.println("beforetest");
	}
}
