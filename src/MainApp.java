import java.io.*;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the program!");
            System.out.println("Select mode:");
            System.out.println("1. Encrypt text;");
            System.out.println("2. Decipher the text;");
            System.out.println("3. Exit.");

            InputStream stream = System.in;
            Scanner console = new Scanner(stream);
            byte input = console.nextByte();

            CipherAndUnCipher cipherAndUnCipher = new CipherAndUnCipher();
            FileManager fileManager = new FileManager();


            if (input == 1) {
                String fileAddress = PathAndKey.fileAddress();
                String encryptedFileAddress = PathAndKey.encryptedFileAddress();
                int key = PathAndKey.key();
                List<String> list = fileManager.readingFile(fileAddress);

                cipherAndUnCipher.cipherList(list, key, encryptedFileAddress);

            } else if (input == 2) {
                String fileAddress = PathAndKey.fileAddress();
                String encryptedFileAddress = PathAndKey.encryptedFileAddress();
                int key = PathAndKey.key();
                List<String> list = fileManager.readingFile(fileAddress);

                cipherAndUnCipher.unCipherList(list, key, encryptedFileAddress);

            } else if (input == 3) {
                System.out.println("Good Bye!");
                break;
            }
        }
    }
}