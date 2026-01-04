package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
public class TC02_LoginCustomer extends BaseClass{
	@Test(groups= {"Regression","Master"})
	public void verifyLogin() throws InterruptedException {
		  try {
		//Homepage
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		Thread.sleep(3000);
		
		//LoginPage
		LoginPage lp=new LoginPage(driver);
		lp.enterEmail(p.getProperty("email"));
		lp.enterPassword(p.getProperty("password"));
		lp.clickLoginBtn();
		Thread.sleep(3000);
		
		//MyAccountPage
		
		MyAccountPage ma=new MyAccountPage(driver);
		boolean myAcctxt=ma.verifyMyAccountText();
		Assert.assertTrue(myAcctxt);
		
		}
		  catch(Exception e)
		{
			Assert.fail();
		}
		  Thread.sleep(3000);
	}
}
