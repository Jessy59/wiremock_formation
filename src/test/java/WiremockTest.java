import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@RunWith(JUnit4.class)
public class WiremockTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(8080);

    @Test
    public void testApi() throws IOException {
        //GIVEN
        stubFor(get("/api/messages").willReturn(ok()));

        //WHEN
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("http://localhost:8080/api/messages");
        CloseableHttpResponse response = httpClient.execute(request);

        //THEN
        verify(getRequestedFor(urlEqualTo("/api/messages")));
        verify(1, getRequestedFor(urlEqualTo("/api/messages")));
        verify(lessThanOrExactly(1), getRequestedFor(urlEqualTo("/api/messages")));
    }
}
