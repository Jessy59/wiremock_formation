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
    public WireMockRule wireMockServer = new WireMockRule(8080);

    @Test
    public void test() throws IOException {
        stubFor(get("/test/").willReturn(aResponse().withStatus(200).withStatusMessage("ok")));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://localhost:8080/test/");
        CloseableHttpResponse response = httpClient.execute(httpGet);

        verify(getRequestedFor(urlEqualTo("/test/")));
    }

}
