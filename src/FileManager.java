import java.io.*;
import java.util.Scanner;
//Отвечает за чтение и запись файлов.

public class FileManager {
    byte key = 0;
    String fileAddress = "";
    String encryptedFileAddress = "";
    char[] buffer = new char[1024];
    int charsRead;

    public void enterPathAndKey() {
        InputStream stream = System.in;
        Scanner console = new Scanner(stream);

        System.out.println("Specify the path to the text file:");
        fileAddress = console.nextLine();

        System.out.println("Specify the path where to write the cipher:");
        encryptedFileAddress = console.nextLine();

        System.out.println("Enter the key for encoding:");
        key = console.nextByte();
        while (true) {
            if (key >= 0 && key <= 25) {
                break;
            } else if (key < 0) {
                System.out.println("The key can't be negative.");
                System.out.println("Enter new key for encoding:");
                key = console.nextByte();
            } else if (key > 25) {
                System.out.println("The key can't be greater than 25.");
                System.out.println("Enter new key for encoding:");
                key = console.nextByte();
            }
        }
    }

    public void readFile() {
        try (FileReader reader = new FileReader(fileAddress);
             StringWriter writer = new StringWriter();
             OutputStream in = new FileOutputStream(encryptedFileAddress)) {

            while ((charsRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, charsRead);
            }

            char[] charArray = writer.toString().toCharArray();
            System.out.println("Characters read: " + charArray.length);

            char[] buff = Cipher.cipher(charArray, key);
            byte[] answer = new byte[Cipher.cipher(charArray, key).length];
            for (var i = 0; i < answer.length; i++) {
                answer[i] = (byte) buff[i];
            }

            in.write(answer);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }


}
