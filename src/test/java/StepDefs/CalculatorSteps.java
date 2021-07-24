package StepDefs;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class CalculatorSteps {
	
	
	int result ;
	
	 @Given("^The calculator application is open$")
	    public void the_calculator_application_is_open() throws Throwable {
		 
		 System.out.println(" Inside Given ");
	       
	    }

	    @When("^I add two numbers (-?\\d+) and \"([^\"]*)\"$")
	    public void i_add_two_numbers_something_and_something(int num1, int num2) throws Throwable {
	       result = num1+num2;
	    }
	    

	    @When("^I multiply (-?\\d+) and \"([^\"]*)\"$")
	    public void i_multiply_two_numbers_something_and_something(int num1, int num2) throws Throwable {
	       result = num1*num2;
	    }

	    @Then("^I should get the result as \"([^\"]*)\"$")
	    public void i_should_get_the_result_as_something(int expectedResult) throws Throwable {
	    	if (result == expectedResult) {
	    		System.out.println("test passed");
	    	}else {
	    		System.out.println("test failed");
	    	}
	       
	    	Assert.assertEquals(result, expectedResult);
	    }
}
