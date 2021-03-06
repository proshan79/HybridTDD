package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginSuccessPage;

public class LoginTest extends TestBase{
	HomePage hp;
	LoginSuccessPage lsp;
		
	@BeforeTest
	public void loadBrowser() {
		initalization ();
		hp = new HomePage();
		lsp = new LoginSuccessPage();
			
	
	}
	@AfterTest
	public void closeBrowser() {
		tearDown();
	}
	@Test
	public void positiveLoginTestHomePage() {
	hp.enteruserName(prop.getProperty("username"));
	hp.enterpassword(prop.getProperty("password"));
	hp.clickSubmitBtn();
	Assert.assertEquals(lsp.getLoginSuccessMsg(), "Login Successfully");
	}
	
}
