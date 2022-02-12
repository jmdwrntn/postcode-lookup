import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IOException, InterruptedException {
        // Catch exception if postcode is entered in 'CB3 0FA' format, API requires 'CB30FA'
        String postcode = "";
        try {
            postcode = args[0] + args[1];
        } catch (ArrayIndexOutOfBoundsException a) {
            postcode = args[0];
        }

        // Create new HttpHandler object to process sending requests to API
        HttpHandler hh = new HttpHandler();
        // Check postcode was validated before retrieving country, region, and nearest postcodes
        if (hh.validation(postcode).getResult()) {
            // Lookup postcode and return toString() containing country and region
            System.out.println(hh.check(postcode).getResult());
            // Stream List of nearest postcode results and print toString() for each
            hh.nearest(postcode).getResult().stream()
                    .forEach(pc -> System.out.println(pc));
        } else {
            // If postcode validation returned false then postcode is invalid
            System.out.println("ERROR: Invalid postcode: " + postcode);
        }
    }
}
