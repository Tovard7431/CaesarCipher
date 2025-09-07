import java.io.InputStream;
import java.util.Scanner;

public class PathAndKey {


    public static String fileAddress() {
        InputStream stream = System.in;
        Scanner console = new Scanner(stream);

        System.out.println("Specify the path to the text file:");
        String fileAddress = console.nextLine();

        return fileAddress;
    }


    public static String encryptedFileAddress() {
        InputStream stream = System.in;
        Scanner console = new Scanner(stream);

        System.out.println("Specify the path where to write the cipher:");
        String encryptedFileAddress = console.nextLine();

        return encryptedFileAddress;
    }


    public static int key() {
        InputStream stream = System.in;
        Scanner console = new Scanner(stream);

        System.out.println("Enter the key for encoding:");
        int key = console.nextInt();

        while (true) {
            if (key >= 0 && key <= 25) {
                break;
            } else if (key < 0) {
                System.out.println("The key can't be negative.");
                System.out.println("Enter new key for encoding:");
                key = console.nextInt();
            } else if (key > 25) {
                System.out.println("The key can't be greater than 25.");
                System.out.println("Enter new key for encoding:");
                key = console.nextInt();
            }
        }

        return key;
    }
}
