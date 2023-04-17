package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^title of login page is Facebook - log in or sign up$")
	public void title_of_login_page_is_Facebook_log_in_or_sign_up() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Facebook - log in or sign up",title);
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
	}
	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) {// credentials is an object veriable
//		List<List<String>> data = credentials.cells();
//		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("pass")).sendKeys(data.get(0).get(1));
//	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
	}
	
	  @Then("^user quit$") 
	   public void user_quit() { 
		   driver.quit(); 
		   }

	 
	 
}

