package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginSuccessPage;
import pages.RegisterPage;
import pages.SignOn;

public class HomePageTest extends TestBase {
	HomePage hp;
	SignOn so;
	RegisterPage rp;
	
	@BeforeTest
	public void loadBrowser() {
		initalization ();
		hp = new HomePage();
		so = new SignOn();
		rp = new RegisterPage();
	}
	@AfterTest
	public void closeBrowser() {
		tearDown();
	}
	@Test
	public void SignOnlinkTest() {
		hp.clickSignOnlink();
		Assert.assertEquals(so.getSignOnTitle(), "Sign-on: Mercury Tours");
	}
	@Test
	public void RegisterlinkTest() {
		hp.clickRegisterLink();
		Assert.assertEquals(rp.getRegiseterpageTitle(), "Register: Mercury Tours");

	}
}
