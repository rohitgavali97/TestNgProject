package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.baseClass;

public class VeryfyLogin extends baseClass{

   @Test
	public void login() throws IOException {
	
	   initializeDriver();
	   driver.get("https://login.salesforce.com/");
	   
	  // driver.findElement(By.xpath(null)).sendKeys("test");
	   LoginPageObject obj=new LoginPageObject(driver);
		
	   obj.enterUsername().sendKeys("test");
	   
	   obj.enterPssword().sendKeys("test123");
	   
	   obj.clickOnLogin().click();
	   
		
		
	}
	
}
