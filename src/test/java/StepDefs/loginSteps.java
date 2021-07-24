package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	WebDriver driver = BaseClass.driver;
	
	  @Given("^User has opened the SimpliLearn application$")
	    public void user_has_opened_the_simplilearn_application() throws Throwable {
	        	 	
		  driver.get("https://www.simplilearn.com/");
		  driver.manage().window().maximize();
		  	  
	    }

	    @When("^user clicks on login link$")
	    public void user_clicks_on_login_link() throws Throwable {
	    	
	    	driver.findElement(By.xpath("//a[@class='login']")).click();
	    	
	    }

	   
	    @And("^User enters correct UserName \"([^\"]*)\"$")
	    public void user_enters_correct_username_something(String username) throws Throwable {
	    	driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys(username);
	    	
	        
	    }

	    @And("^User enters correct password \"([^\"]*)\"$")
	    public void user_enters_correct_password_something(String password) throws Throwable {
	        driver.findElement(By.xpath("//input[@name='user_pwd']")).sendKeys(password);
	    }

	    @And("^User clicks on Login button$")
	    public void user_clicks_on_login_button() throws Throwable {
	        
	    }
	    
	    @Then("^User should be landed to the Homepage$")
	    public void user_should_be_landed_to_the_homepage() throws Throwable {
	    	
	    	
	       
	    }

	    @And("^User should be able to see the welcome message$")
	    public void user_should_be_able_to_see_the_welcome_message() throws Throwable {
	       
	    }
	    

}
