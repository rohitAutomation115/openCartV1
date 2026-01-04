package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

@Test(dataProvider="LoginDataProvider",dataProviderClass=DataProviders.class)
public class TC03_LoginDDT extends BaseClass{

	public void verifyLoginDDt(String email, String password, String exp) throws InterruptedException {
		try {
				//Homepage
				HomePage hp=new HomePage(driver);
				hp.clickMyAccount();
				hp.clickLogin();
				Thread.sleep(3000);
				
				//LoginPage
				LoginPage lp=new LoginPage(driver);
				lp.enterEmail(email);
				lp.enterPassword(password);
				lp.clickLoginBtn();
				Thread.sleep(3000);
				
				//MyAccountPage
				
				MyAccountPage ma=new MyAccountPage(driver);
				boolean myAcctxt=ma.verifyMyAccountText();
				
				if(exp.equalsIgnoreCase("valid")) 
				{
					if(myAcctxt==true)
					{
						ma.clickLogout();
						Assert.assertTrue(true);
					}
					else
					{
						Assert.assertTrue(false);
					}
				}
				
				if(exp.equalsIgnoreCase("Invalid"))
				{
					if(myAcctxt==true)
					{
						ma.clickLogout();
						Assert.assertTrue(false);
					}
					else
					{
						Assert.assertTrue(true);
					}
				}
		}catch(Exception e)
		{
			Assert.fail();
		}
	}
}
