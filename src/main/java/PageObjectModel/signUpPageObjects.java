package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObjects {

	public WebDriver driver;
	
	By firstname=By.xpath("//input[@name='UserFirstName']");
	By lastname=By.xpath("//input[@name='UserLastName']");
	
	By employee=By.xpath("//select[@name='CompanyEmployees']");
	 
	public signUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver=driver2;
	}
	public WebElement enterFirstname() {
		
		return driver.findElement(firstname);
		
	}
	public WebElement enterLastname() {
		
		return driver.findElement(lastname);
		
	}
    public WebElement selectEmpolyee() {
    	  
    return driver.findElement(employee);
}
}
