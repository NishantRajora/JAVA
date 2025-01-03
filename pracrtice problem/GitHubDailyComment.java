import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GitHubDailyComment {
    public static void main(String[] args) {
        // Local file path to update
        String filePath = "D:\\Java\\pracrtice problem\\GitHubDailyComment.java";

        try {
            // Add 10 comments to the file
            addComments(filePath);

            // Run Git commands to commit and push changes
            executeCommand("git -C D:\\Java\\pracrtice problem add GitHubDailyComment.java");
            executeCommand("git -C D:\\Java\\pracrtice problem commit -m \"Daily comment update\"");
            executeCommand("git -C D:\\Java\\pracrtice problem push");

            System.out.println("Comments added and changes pushed to GitHub.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void addComments(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for (int i = 1; i <= 10; i++) {
                writer.write("// Comment " + i + ": This is a changeable comment.\n");
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
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
// Comment 1: This is a changeable comment.
// Comment 2: This is a changeable comment.
// Comment 3: This is a changeable comment.
// Comment 4: This is a changeable comment.
// Comment 5: This is a changeable comment.
// Comment 6: This is a changeable comment.
// Comment 7: This is a changeable comment.
// Comment 8: This is a changeable comment.
// Comment 9: This is a changeable comment.
// Comment 10: This is a changeable comment.
