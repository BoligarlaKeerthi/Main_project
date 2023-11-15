package com.sportyshoe.TestScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SportyShoes.Selenium_scripts_using_TestNG.HomePage;
import com.SportyShoes.Selenium_scripts_using_TestNG.LoginPage;
import com.SportyShoes.Selenium_scripts_using_TestNG.RegisterPage;
import com.SportyShoes.Selenium_scripts_using_TestNG.TestBase;

public class LoginPageTest extends TestBase{
	
	HomePage hp;
	RegisterPage rp;
	LoginPage lp;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
		lp = new LoginPage(driver);
	}

	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}

	
	@Test(priority='2')
	public void test_getTitle_page()
	{
		String expected = "http://localhost:9010/login";
		String Actual = hp.getURL_page();
		Assert.assertEquals(Actual, expected);
		
	}
	
@Test(priority='3')
	
	public void Test_validate_registration_Text()
	{
		String expected = "Hello user !";
		String actualText = rp.validate_registration_Text();
		Assert.assertEquals(actualText, expected);
	}


@Test(priority='4')

public void test_click_cart()
{
	lp.click_cart();
}


	

}
