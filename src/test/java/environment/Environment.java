package environment;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;

public class Environment {
	
	@Given("^I set environment with (env\\d+)$")
	public void i_set_environment_with_env(String envName) throws Exception {
	    // This can take environment definition from utils/env/[envName]
	    System.out.println(envName);
	}
	
	@Given("^I set custom environment$")
	public void i_set_custom_environment() throws Exception {
	    // This section should take environment info from the Environment variables
		// as in get them from CI like Jenkins
	}
}
