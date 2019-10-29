package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DemoWebShopRegister {
	WebDriver anil;
	@Given("User is on the Home Page")
	public void user_is_on_the_Home_Page() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		anil=new ChromeDriver();
	    anil.get("http://demowebshop.tricentis.com/");
	   
	   
	}

	@Given("User Choose to Register")
	public void user_Choose_to_Register() {
		anil.findElement(By.xpath("//a[text()='Register']")).click();
	   
	}

	@When("User Selects {string}")
	public void user_Selects(String gender) {
		System.out.println(gender);
		if(gender.equals("M"))
				anil.findElement(By.xpath("//input[@value='M']")).click();	
		if (gender.equals("F"))
			anil.findElement(By.xpath("//input[@value='F']")).click();
	  
	}

	@When("user enters {string},{string},{string},{string}")
	public void user_enters(String string,String string1, String string2, String string3) {
		anil.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(string);
		anil.findElement(By.xpath("//input[@name='LastName']")).sendKeys(string1);
		anil.findElement(By.xpath("//input[@name='Email']")).sendKeys(string2);
		anil.findElement(By.xpath("//input[@name='Password']")).sendKeys(string3);
		anil.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(string3);
		
	  
	}

	@When("user clicks on Register")
	public void user_clicks_on_Register() {
		anil.findElement(By.xpath("//input[@name='register-button']")).click();
	  
	}

	@Then("User Registration Shall be Succesful")
	public void user_Registration_Shall_be_Succesful() throws InterruptedException {
		String T1=anil.getCurrentUrl();
		Thread.sleep(3000);
		anil.close();
		Assert.assertEquals(T1,"http://demowebshop.tricentis.com/registerresult/1");
	    
	}

}
