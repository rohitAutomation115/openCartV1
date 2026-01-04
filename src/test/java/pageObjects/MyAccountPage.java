package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@id='content']/h2")
	WebElement txtMyAccount;
	
	@FindBy(partialLinkText="Logout")
	WebElement lnkLogout;
	
	public boolean verifyMyAccountText()
	{
		try {
		return txtMyAccount.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}

}
