package homePage;

import gmail.LoginPage;
import helper.LoggerHelper;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.DataSource;
import testBase.TestBase;

public class LoginTest extends TestBase {
private final Logger log= LoggerHelper.getLogger(LoginTest.class);
	
	@Test
	
	public void testLoginApplication(){
		
		DataSource config=new DataSource();
		System.out.println("driver=" + driver);
		driver.get(config.getWebsite());
		System.out.println("driver=" + driver); 
		LoginPage loginpage=new LoginPage(driver);
		System.out.println("");
		loginpage.enterEmailAddress("emailAddress");
		boolean status=loginpage.verifySuccessLoginMsg();
		
		if(status){
			log.info("login is successful");
		}
		else{
		      Assert.assertTrue(false, "login is not successful");  
		}
	}

}
