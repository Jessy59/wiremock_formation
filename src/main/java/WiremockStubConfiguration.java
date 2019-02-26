import com.github.tomakehurst.wiremock.http.Fault;
import com.github.tomakehurst.wiremock.http.UniformDistribution;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class WiremockStubConfiguration {

    public static void stubConfiguration() {
        // urlPathEqualTo
//        stubFor(get(urlPathEqualTo("/api/messages/")).willReturn(aResponse().withStatus(200).withBodyFile("api/messages/messages.json")));

        // urlPathMatching
//        stubFor(get(urlPathMatching("/api/.*")).willReturn(aResponse().withStatus(200).withBodyFile("api/messages/messages.json")));

        // query check
//        stubFor(get(urlMatching("/api/([a-z]*)\\?param=([a-z]*)")).willReturn(aResponse().withStatus(200).withBodyFile("api/messages/messages.json")));

        // withQueryParam
//        stubFor(get(urlPathEqualTo("/api/messages")).withQueryParam("param", equalTo("toto")).willReturn(aResponse().withBodyFile("api/messages/messages.json")));

        // withHeader
//        stubFor(get(urlPathEqualTo("/api/messages")).withHeader("Content-Type", equalTo("application/json")).willReturn(aResponse().withBody("{\n" +
//                "  \"message\": \"ok\"\n" +
//                "}")));

        // Check attribute is present in request body
//        stubFor(post(urlPathEqualTo("/api/messages")).withRequestBody(matchingJsonPath("$.id")).willReturn(ok("Message crée !")));

        // return 404
//        stubFor(get(urlMatching("/api/messages\\?id=([a-z]*)")).willReturn(aResponse().withStatus(404)));

        // notauthorized
//        stubFor(get("/admin").willReturn(forbidden()));

        // redirection
//        stubFor(get("/app-api/messages").willReturn(temporaryRedirect("/api/messages")));
//        stubFor(get(urlPathEqualTo("/api/messages")).willReturn(aResponse().withStatus(200).withBodyFile("api/messages/messages.json")));

        // delay
//        stubFor(get("/api/messages").willReturn(aResponse().withFixedDelay(5000).withBodyFile("api/messages/messages.json")));
//        stubFor(get("/api/messages").willReturn(aResponse().withRandomDelay(new UniformDistribution(1000, 5000)).withBodyFile("api/messages/messages.json")));

        // priority
//        stubFor(get("/api/messages").willReturn(aResponse().withBody("specific stub")));
//        stubFor(get(urlPathMatching("/api/.*")).willReturn(aResponse().withBody("generic stub")));

    }
}
