import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public List<String> readingFile(String fileAddress) {
        List<String> charList = new ArrayList<>();

        try {
            byte[] bytes = Files.readAllBytes(Paths.get(fileAddress));

            for (byte b : bytes) {
                char character = (char) b;
                charList.add(String.valueOf(character));
            }

            System.out.println("Read characters: " + charList.size());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return charList;
    }

    public void writeFile(List<String> list, String encryptedFileAddress) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(encryptedFileAddress))) {
            for (String line : list) {
                writer.write(line);
            }
            System.out.println("ready! ");

        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}