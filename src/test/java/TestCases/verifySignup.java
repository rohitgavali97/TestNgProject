package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.signUpPageObjects;
import Resources.baseClass;

public class verifySignup extends baseClass {
    @Test
	public void signup() throws IOException, InterruptedException {
		
    	initializeDriver();
    	driver.get("https://login.salesforce.com/");
    	
    	   LoginPageObject LPO=new  LoginPageObject(driver);
    	   
    	     LPO.clickOntryForFree().click();
    	   
    	   signUpPageObjects  SPO=new signUpPageObjects (driver);
    	   
    	   Thread.sleep(5000);
    	   SPO.enterFirstname().sendKeys("ram");
    	   SPO.enterLastname().sendKeys("test");
    	   
    	   WebElement e=SPO.selectEmpolyee();
    	   
    	   Select s=new Select(e);
    	   s.selectByIndex(1);
    	   
    	
	}
    
    
	
	
}
