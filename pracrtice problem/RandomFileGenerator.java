import java.io.*;
import java.nio.file.*;
import java.util.Random;

public class RandomFileGenerator {
    public static void main(String[] args) {
        // Specify the target directory for the generated files
        String targetDirectory = "./random-files"; // Adjust as needed
        int numberOfFiles = 10; // Specify how many files to create

        // Create the directory if it doesn't exist
        Path dirPath = Paths.get(targetDirectory);
        if (!Files.exists(dirPath)) {
            try {
                Files.createDirectories(dirPath);
                System.out.println("Created directory: " + dirPath.toAbsolutePath());
            } catch (IOException e) {
                System.err.println("Failed to create directory: " + e.getMessage());
                return;
            }
        }

        // Generate the random files
        for (int i = 0; i < numberOfFiles; i++) {
            createRandomFile(targetDirectory, i);
        }

        System.out.println("Finished creating " + numberOfFiles + " random files.");
    }

    private static void createRandomFile(String directory, int fileNumber) {
        String fileName = "file_" + fileNumber + ".txt";
        Path filePath = Paths.get(directory, fileName);
        try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
            // Generate random content
            String randomContent = generateRandomContent(100); // 100 characters of random text
            writer.write(randomContent);
            System.out.println("Created file: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Failed to create file: " + e.getMessage());
        }
    }

    private static String generateRandomContent(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder content = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            content.append(characters.charAt(random.nextInt(characters.length())));
        }
        return content.toString();
    }
}
