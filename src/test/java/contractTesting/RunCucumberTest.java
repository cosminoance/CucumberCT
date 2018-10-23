package contractTesting;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
import static org.mockserver.integration.ClientAndProxy.startClientAndProxy;
import static org.mockserver.integration.ClientAndServer.startClientAndServer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.mockserver.client.server.MockServerClient;
import org.mockserver.integration.ClientAndProxy;
import org.mockserver.integration.ClientAndServer;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
glue= {"environment/", "contractTesting/"})
public class RunCucumberTest {
	
	private ClientAndProxy proxy;
	private ClientAndServer mockServer;
	
	@Before
	public void startProxy() {
	    mockServer = startClientAndServer(1080);
	    proxy = startClientAndProxy(1091);
	}
	
	@After
	public void stopProxy() {
	    proxy.stop();
	    mockServer.stop();
	}
}