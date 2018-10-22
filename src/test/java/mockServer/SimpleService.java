package mockServer;

import org.mockserver.client.server.MockServerClient;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;

public class SimpleService {

	private void SomeService() {
		
		new MockServerClient("localhost", 1080).when(new HttpRequest()
	            .withMethod("POST")
	            .withPath("/login")
	            .withBody("{username: 'foo', password: 'bar'}")
	    ).respond(
	        new HttpResponse()
	            .withStatusCode(302)
	            .withCookie(
	                "sessionId", "2By8LOhBmaW5nZXJwcmludCIlMDAzMW"
	            )
	            .withHeader(
	                "Location", "https://www.mock-server.com"
	            )
	    );
	}
}
