package testCases;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC01_RegisterCustomer extends BaseClass{
	
	
	@Test(groups={"Sanity","Master"})
	public void verifyRegisterCustomer() throws InterruptedException
	{
		Thread.sleep(3000);
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		Thread.sleep(3000);
		RegisterPage rp=new RegisterPage(driver);
		rp.setFirstName(randomString());
		rp.setLastName(randomString());
		rp.setEmail(randomAlphanumeric()+"@gmail.com");
		rp.setTelephone(randomNumbers());
		
		String pass=randomAlphanumeric();
		
		rp.setPassword(pass);
		rp.setConfPassword(pass);
		rp.subscribeChannel();
		rp.clickCheckbox();
		rp.clickOnContinue();
		Thread.sleep(3000);
		String msg=rp.getConfMsg();
		Assert.assertEquals(msg, "Your Account Has Been Created!");
	}
}
