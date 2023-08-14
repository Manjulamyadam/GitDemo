package Test;

import org.testng.annotations.Test;

public class day4 {

	
	@Test
	public void webloginhomeloan()
	{
		System.out.println("webloginhome");
	}
	@Test(groups="{smoke}")
	public void Mobilehomeloan()
	{
		System.out.println("mobilehome");
		
	}
	@Test
	public void 	LoginAPIhomeloan()
	{
		System.out.println("loginapihome");
	}

}
