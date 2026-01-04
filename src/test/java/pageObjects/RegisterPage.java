package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	@FindBy(id="input-firstname")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement txtLastName;
	
	@FindBy(css="input[placeholder='E-Mail']")
	WebElement txtEmail;
	
	@FindBy(xpath="//div[@class='col-sm-10']/input[@name='telephone']")
	WebElement txtTelephone;
	
	@FindBy(id="input-password")
	WebElement txtPassword;
	
	@FindBy(id="input-confirm")
	WebElement txtConfPassword;
	
	@FindBy(xpath="//label[@class='radio-inline']//input[@value='1']")
	WebElement btnYes;
	
	@FindBy(css="input[type='checkbox']")
	WebElement chBox;
	
	@FindBy(css="input[value='Continue']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//div[@id='content']//h1")
	WebElement confMsg;
	
	public void setFirstName(String fName)
	{
		txtFirstName.sendKeys(fName);	
	}
	
	public void setLastName(String LName)
	{
		txtLastName.sendKeys(LName);	
	}
	
	public void setEmail(String mail)
	{
		txtEmail.sendKeys(mail);	
	}
	
	public void setTelephone(String numb)
	{
		txtTelephone.sendKeys(numb);	
	}
	
	public void setPassword(String pass)
	{
		txtPassword.sendKeys(pass);
	}
	
	public void setConfPassword(String pass)
	{
		txtConfPassword.sendKeys(pass);
	}
	
	public void subscribeChannel()
	{
		btnYes.click();
	}
	
	public void clickCheckbox()
	{
		chBox.click();
	}
	
	public void clickOnContinue() 
	{
		btnSubmit.click();
	}
	
	public String getConfMsg()
	{
		try {
			return (confMsg.getText());
		}
		catch(Exception e){
			return (e.getMessage());
		}
	}
	
	
	
	
	
	
	

}
