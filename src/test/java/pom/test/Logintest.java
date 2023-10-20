package pom.test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.loginpom;

public class Logintest extends BaseClass{
loginpom login;
	
	@BeforeMethod
	public void SetUp(Method m) throws IOException 
	{
		
		LaunchTheWeb();
		login= new loginpom();
	System.out.println("**TestName*"+m.getName());	
		
	}
	
	

	@AfterMethod
	public void tearDown()
	
	{
		driver.quit();
	}
	
	
	@Test
	public void LoginWithValidCredential() throws InterruptedException
	{
		
		login.InputEnterUsername("Admin");
		Thread.sleep(2000);
		
		login.InputEnterpassword("admin123");
		Thread.sleep(2000);
		login.ClickOnLoginButton();
		Thread.sleep(2000);
		
		String actual = driver.getTitle();
		String expected=prop.getProperty("Logintitle");
		
		Assert.assertEquals(actual,expected); 
	}
}
