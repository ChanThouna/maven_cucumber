package StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class FBSignUpSteps { 
	
	 WebDriver driver = BaseClass.driver;

    @Given("^User has launched the application$")
    public void user_has_opened_the_facebook_application() throws Throwable {
    	
    	
    	driver.get("https://en-gb.facebook.com/");
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
    }


    @When("^User clicks on Create New Account button$")
    public void user_clicks_on_create_new_account_button() throws Throwable {
    	WebElement CreateAccount = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
    	CreateAccount.click();   
    }

  
    @And("^user creates the new account$")
    public void user_creates_the_new_account(DataTable table) throws Throwable {
    
   	    	String FirstName = table.cell(1, 1);
   	    	String LastName = table.cell(2, 1);
   	    	String MobileNum = table.cell(3, 1);
   	    	String Password = table.cell(4, 1);
   	    	
   	    	WebElement tbFirstName = driver.findElement(By.xpath("//*[@name='firstname']"));
   	    	WebElement tbLastName = driver.findElement(By.xpath("//*[@name='lastname']"));
   	    	WebElement tbMobile = driver.findElement(By.xpath("//*[@name='reg_email__']"));
   	    	WebElement tbPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
   	    	
   	    	tbFirstName.sendKeys(FirstName);
   	    	tbLastName.sendKeys(LastName);
   	    	tbMobile.sendKeys(MobileNum);
   	    	tbPassword.sendKeys(Password);
   	    	
   	    	
   	    }

       

    @And("^User clicks on SignUp button$")
    public void user_clicks_on_signup_button() throws Throwable {
       
    }
    
    
    @Then("^User should be able to see success message$")
    public void user_should_be_able_to_see_success_message() throws Throwable {
        
    }
}