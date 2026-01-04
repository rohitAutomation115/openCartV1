package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}

	@FindBy(css="a[title='My Account']")
	WebElement btnMyAccount;
	
	@FindBy(partialLinkText="Register")
	WebElement lnkRegister;
	
	@FindBy(partialLinkText="Login")
	WebElement lnkLogin;
	
	public void clickMyAccount()
	{
		btnMyAccount.click();
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
	public void clickLogin() {
	
		lnkLogin.click();
	}
}