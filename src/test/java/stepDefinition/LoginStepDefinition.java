package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^user is already on Login page$")
	public void user_is_already_on_Login_page() {
		System.setProperty("webdriver.chrome.driver","F:/feecrmBDDFramework/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	
	@When("^title of Login page is Free CRM$")
	public void when_title_of_page_is_free_crm() {
		String act_title = driver.getTitle();
		String exp_title = "Cogmento CRM";
		Assert.assertEquals(exp_title, act_title);
		
	}
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("email")).sendKeys("raviranjanind80@gmail.com");
		driver.findElement(By.name("password")).sendKeys("R@vi1990");
	}
	
	@Then("^user clicks on Login button$")
	public void user_enters_login_button() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//		WebElement loginbtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()", loginbtn);
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String acttitle = driver.getTitle();
		System.out.println("the title is :"+acttitle);
		Assert.assertEquals("Cogmento CRMO",acttitle);
	}
}
