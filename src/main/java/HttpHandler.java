import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpHandler {

    private HttpClient client;
    private Gson gson;

    public HttpHandler() {
        // Create new HttpClient and Gson clients on construction, used across all methods
        this.client = HttpClient.newHttpClient();
        this.gson = new Gson();
    }

    public Validate validation(String postcode) throws IOException, InterruptedException {
        HttpRequest vld = HttpRequest.newBuilder()
                .uri(URI.create("http://api.postcodes.io/postcodes/" + postcode + "/validate"))
                .timeout(Duration.ofSeconds(10))
                .GET()
                .build();

        // Return string representation of API JSON response
        HttpResponse vldResponse = client.send(vld, HttpResponse.BodyHandlers.ofString());
        String vldJson = vldResponse.body().toString();
        // Map to Validate class, result is simply boolean value
        Validate vd1 = gson.fromJson(vldJson, Validate.class);
        return vd1;
    }

    public Postcode check(String postcode) throws IOException, InterruptedException {
        HttpRequest chk = HttpRequest.newBuilder()
                .uri(URI.create("http://api.postcodes.io/postcodes/" + postcode))
                .timeout(Duration.ofSeconds(10))
                .GET()
                .build();

        HttpResponse chkResponse = client.send(chk, HttpResponse.BodyHandlers.ofString());
        String chkJson = chkResponse.body().toString();
        // Map to main Postcode class
        Postcode pc1 = gson.fromJson(chkJson, Postcode.class);
        return pc1;
    }

    public Nearest nearest(String postcode) throws IOException, InterruptedException {
        HttpRequest nrs = HttpRequest.newBuilder()
                .uri(URI.create("http://api.postcodes.io/postcodes/" + postcode + "/nearest"))
                .timeout(Duration.ofSeconds(10))
                .GET()
                .build();

        HttpResponse nrsResponse = client.send(nrs, HttpResponse.BodyHandlers.ofString());
        String nrsJson = nrsResponse.body().toString();
        // Map to Nearest class, same as Postcode but handles List of results
        Nearest nr1 = gson.fromJson(nrsJson, Nearest.class);
        return nr1;
    }
}
