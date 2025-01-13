import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class RandomCheckLinks {

    // Function to generate a random user ID with random integers and alphabets
    public static String generateRandomUserId() {
        Random random = new Random();
        StringBuilder userId = new StringBuilder();

        // Pattern for userId: mix of random letters and integers
        String pattern = "-w_1gMo_n2frAhTkKW8dtd74XB9YMLDW8Yl_CWF53yE_";
        
        for (char c : pattern.toCharArray()) {
            if (Character.isDigit(c)) {
                // Replace digit with a random integer (0-9)
                userId.append(random.nextInt(10));
            } else if (Character.isLetter(c)) {
                // Replace letter with a random alphabet (uppercase or lowercase)
                char randomChar = (char) ((random.nextBoolean() ? 'A' : 'a') + random.nextInt(26));
                userId.append(randomChar);
            } else {
                // Keep special characters as they are
                userId.append(c);
            }
        }

        return userId.toString();
    }

    // Function to check if the link is valid for a given userId
    public static boolean checkLinkValidity(String userId) {
        String session = "19";
        String baseUrl = "https://uatapi.ncuindia.edu/api/myapp/Examination/GetDGS";
        String urlString = baseUrl + "?userId=" + userId + "&session=" + session;

        try {
            // Create the URL object
            URL url = new URL(urlString);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Set a timeout of 10 seconds
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);

            // Get the response code
            int responseCode = connection.getResponseCode();

            // If the response code is 200 (HTTP OK), the link is valid
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                System.out.println("Response for userId " + userId + ": " + response.toString());
                return true;
            } else {
                System.out.println("Response code for userId " + userId + ": " + responseCode);
            }
        } catch (Exception e) {
            System.err.println("Error for userId " + userId + ": " + e.getMessage());
        }

        return false;
    }

    public static void main(String[] args) {
        // Loop through 100 random user IDs
        for (int i = 1; i <= 100; i++) {
            // Generate a random userId
            String userId = generateRandomUserId();

            System.out.println("Checking link for userId: " + userId);
            boolean isValid = checkLinkValidity(userId);

            if (isValid) {
                System.out.println("Link is valid for userId: " + userId);
            } else {
                System.out.println("Link is invalid for userId: " + userId);
            }
        }
    }
}
