import com.github.tomakehurst.wiremock.WireMockServer;

public class WiremockServerLauncher {

    public static void main(String[] args) {
        WireMockServer wireMockServer = new WireMockServer(8080);

        wireMockServer.start();

    }
}
