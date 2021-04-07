package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SignOn extends TestBase{
	@FindBy(name="userName")
	WebElement userNameTestField;
	
	@FindBy(name="password")
	WebElement passwordTestField;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
	public SignOn() {
		PageFactory.initElements(driver, this);
	
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
	public String getSignOnTitle() {
		return driver.getTitle();
	}
}
