import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GitHubDailyComment {
    public static void main(String[] args) {
        String filePath = "D:\\Java\\pracrtice problem"; // Replace with the path to your file
        try {
            // Add 10 comments to the file
            addComments(filePath);

            // Run Git commands to commit and push changes
            executeCommand("git add " + filePath);
            executeCommand("git commit -m \"Daily comment update\"");
            executeCommand("git push");

            System.out.println("Comments added and changes pushed to GitHub.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void addComments(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (int i = 1; i <= 10; i++) {
                writer.write("// Comment " + i + ": This is a changable comment.\n");
            }
            System.out.println("10 comments added to the file.");
        }
    }

    private static void executeCommand(String command) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec(command);
        process.waitFor();

        // Log output for debugging
        if (process.exitValue() == 0) {
            System.out.println("Command executed successfully: " + command);
        } else {
            System.err.println("Command failed: " + command);
        }
    }
}
