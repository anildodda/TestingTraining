package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class invalidCart {
	WebDriver anil;
	@Given("Alex is on the Home Page of the App")
	public void alex_is_on_the_Home_Page_of_the_App() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		anil=new ChromeDriver();
	    anil.get("http://demowebshop.tricentis.com/");
	   
	}

	@Given("Searched for the Product")
	public void searched_for_the_Product() {
		anil.findElement(By.xpath("//input[@name='q']")).sendKeys("Computer");
	  
	}

	@When("Clicks on cart")
	public void clicks_on_cart() {
		anil.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	  
	}

	@Then("he sees no items in the cart")
	public void he_sees_no_items_in_the_cart() {
		String S1= anil.findElement(By.className("order-summary-content")).getText();
		System.out.println(S1);
		Assert.assertEquals(S1,"Your Shopping Cart is empty!");
		anil.close();
		
	 
	}
	@Given("Alex is on the Home Page")
	public void alex_is_on_the_Home_Page() {
		System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
		anil=new ChromeDriver();
	    anil.get("http://demowebshop.tricentis.com/");
	}

	@Given("Alex Searched for the Product")
	public void alex_Searched_for_the_Product() {
		anil.findElement(By.xpath("//input[@name='q']")).sendKeys("Computer");
		anil.findElement(By.xpath("//input[@value='Search']")).click();
	}

	@When("Alex Click on Add to cart")
	public void alex_Click_on_Add_to_cart() throws InterruptedException {
		anil.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
		Thread.sleep(2000);
		anil.findElement(By.xpath("//input[@data-productid='72']")).click();
	}

	@When("Alex Click on Cart link")
	public void alex_Click_on_Cart_link() {
		
		anil.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	 
	}
	@Then("Cart should contain the Product")
	public void cart_should_contain_the_Product() {
		Assert(anil.findElement(By.xpath("//button[@id='checkout']")).isEnabled());
//	System.out.println(S);
	
	}

	private void Assert(boolean enabled) {
		// TODO Auto-generated method stub
		
	}

}
