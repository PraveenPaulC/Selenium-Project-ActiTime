package pom;

import org.testng.annotations.Test;

import generic.GenericMethods;

public class TestCase1 extends GenericMethods {
	@Test
	public void test()
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.setusername("admin");
		lp.setpassword("manager");
		lp.click_login();
	}

}
