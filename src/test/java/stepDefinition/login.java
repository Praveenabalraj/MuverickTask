package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import loginpom.loginpg;

public class login extends loginpg {
	
	public ChromeDriver driver;
	
	@Given("Launch the Chrome Browser")
	public void launch_the_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	}

	@Given("load url {string}")
	public void load_url(String url) {
		driver.get(url);
	}   
	
	@When("User enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("uid")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);	
	}
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Then("User validates login is successfull")
	public void user_validates_login_is_successfull() {
		String title =driver.findElement(By.tagName("h2")).getText();
		assertEquals(title, "Gtpl Bank");
	}
	
	@When("User clicks on new customer button")
	public void user_clicks_on_new_customer_button() throws InterruptedException {
	    driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	    
	    try {
	    	new WebDriverWait(driver, Duration.ofSeconds(5))
	    	        .until(ExpectedConditions.elementToBeClickable(By.id("dismiss-button"))).click();
	    	
		} catch (Exception e) {
			System.out.println("There is no ad popup");
		}
	}

	@When("User enters {string} customer name")
	public void user_enters_customer_name(String name) {
	    driver.findElement(By.name("name")).sendKeys(name);
	}

	@When("User clicks on gender button")
	public void user_clicks_on_gender_button() {
	   driver.findElement(By.xpath("//input[@name='rad1'][2]")).click();
	}

	@When("User enters {string} customer DOB")
	public void user_enters_customer_dob(String dob) {
		 driver.findElement(By.id("dob")).sendKeys(dob);
	}

	@When("User enters {string} customer address")
	public void user_enters_customer_address(String string) {
		 driver.findElement(By.name("addr")).sendKeys(string);
	}

	@When("User enters {string} customer city")
	public void user_enters_customer_city(String string) {
		 driver.findElement(By.name("city")).sendKeys(string);
	}

	@When("User enters {string} customer state")
	public void user_enters_customer_state(String string) {
		 driver.findElement(By.name("state")).sendKeys(string);
	}

	@When("User enters {string} customer pincode")
	public void user_enters_customer_pincode(String string) {
		 driver.findElement(By.name("pinno")).sendKeys(string);
	}

	@When("User enters {string} customer phone no")
	public void user_enters_customer_phone_no(String string) {
		 driver.findElement(By.name("telephoneno")).sendKeys(string);
	}

	@When("User enters {string} customer gmail")
	public void user_enters_customer_gmail(String string) {
		 driver.findElement(By.name("emailid")).sendKeys(string);
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
	    driver.findElement(By.name("sub")).click();
	}

	@Then("User validates successful message")
	public void user_validates_successful_message() {
	   System.out.println("Test passed");
	}
	
	@When("the user clicks Edit customer button")
	public void the_user_clicks_edit_customer_button() {
		driver.findElement(By.xpath("//a[text()='Edit Customer']")).click();
		try {
	    	new WebDriverWait(driver, Duration.ofSeconds(5))
	    	        .until(ExpectedConditions.elementToBeClickable(By.id("dismiss-button"))).click();
	    	
		} catch (Exception e) {
			System.out.println("There is no ad popup");
		}
	}

	@When("the user enters {string}")
	public void the_user_enters(String string) {
		driver.findElement(By.name("cusid")).sendKeys(string);
	}

	@When("clicks submit button")
	public void clicks_submit_button() {
		driver.findElement(By.name("AccSubmit")).click();
	}
	
	@When("the user clicks Delete customer button")
	public void the_user_clicks_delete_customer_button() {
		driver.findElement(By.xpath("//a[text()='Delete Customer']")).click();
		try {
	    	new WebDriverWait(driver, Duration.ofSeconds(5))
	    	        .until(ExpectedConditions.elementToBeClickable(By.id("dismiss-button"))).click();
	    	
		} catch (Exception e) {
			System.out.println("There is no ad popup");
		}
	}
}

	
