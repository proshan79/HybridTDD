package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegisterPage extends TestBase{

		
	@FindBy(name="email")
	WebElement userNameTestField;
	
	@FindBy(name="password")
	WebElement passwordTestField;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
	public RegisterPage() {
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
	public String getRegiseterpageTitle() {
		return driver.getTitle();
	}
}
