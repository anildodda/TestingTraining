package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DemoWebShopLogin {
	WebDriver anil;

	@Given("user is on the demo Web Shop Homepage")
	public void john_is_on_the_demo_Web_Shop_Homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		anil=new ChromeDriver();
	    anil.get("http://demowebshop.tricentis.com/");
	   
	}

	@Given("chooses to Click Login")
	public void chooses_to_Click() {
		anil.findElement(By.xpath("//a[text()='Log in']")).click();
	   
	}

	@When("user enters {string}and {string}")
	public void john_enters_Email_and_Password(String String, String String2) {
		anil.findElement(By.xpath("//input[@id='Email']")).sendKeys(String);
	    anil.findElement(By.xpath("//input[@id='Password']")).sendKeys(String2);
	}

	@When("He Clicks Login")
	public void he_Clicks_Login() throws InterruptedException {
		anil.findElement(By.xpath("//input[@value='Log in']")).click();
	   Thread.sleep(2000);
	}

	@Then("He Sees His Home Page")
	public void he_Sees_His_Home_Page() throws InterruptedException {
//		WebElement T1= anil.findElement(By.xpath("//a[text()='karthik456@gmail.com']"));
	//   Assert.assertEquals(T1,"karthik456@gmail.com");
		String Title1=anil.getCurrentUrl();
		Thread.sleep(5000);
		anil.close();
		Assert.assertEquals(Title1, "http://demowebshop.tricentis.com/");
		System.out.println("Log in Succesful");
	}

}
