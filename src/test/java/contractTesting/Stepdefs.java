package contractTesting;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

public class Stepdefs {
	
	

	@When("^I request (.*) with helper (.*)$")
	public void i_request_getUser_with_helper_getUserHelper(String service, String helper) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(service+ helper);
	}

	@Then("^I verify the reponse with helper (.*)$")
	public void i_verify_the_reponse_with_helper_getUserHelper(String helper) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(helper);
	}

}