package contractTesting;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.mockserver.client.server.MockServerClient;
import org.mockserver.integration.ClientAndServer;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
glue= {"environment/", "contractTesting/"})
public class RunCucumberTest {
	
	
}