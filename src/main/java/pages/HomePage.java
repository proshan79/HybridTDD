package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{

	@FindBy(linkText="SIGN-ON")
	WebElement signOnlink;
	
	@FindBy(linkText="REGISTER")
	WebElement registerlink;
	
	@FindBy(name="userName")
	WebElement userNameTestField;
	
	@FindBy(name="password")
	WebElement passwordTestField;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickSignOnlink() {
		signOnlink.click();
	}
	public void clickRegisterLink() {
		registerlink.click();
	}
	public void enteruserName(String username) {
		userNameTestField.sendKeys(username);
	}
	public void enterpassword(String password) {
		passwordTestField.sendKeys(password);
	}
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	public String getHomepageTitle() {
		return driver.getTitle();
	}
}
