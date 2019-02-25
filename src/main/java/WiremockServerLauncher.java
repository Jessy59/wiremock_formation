import com.github.tomakehurst.wiremock.WireMockServer;

public class WiremockServerLauncher {

    public static void main(String[] args) {
        // Instanciation du serveur wiremock
        WireMockServer wireMockServer = new WireMockServer(8080);

        // Démarrage du serveur
        wireMockServer.start();

        // Configuration des stub
        WiremockStubConfiguration.stubConfiguration();

    }
}
