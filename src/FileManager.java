import java.io.*;
import java.util.Scanner;
//Отвечает за чтение и запись файлов.

public class FileManager {
    private static byte key = 0;
    private static String fileAddress = "";
    private static String encryptedFileAddress = "";
    private static char[] buffer = new char[1024];
    private static int charsRead;

    void readFile() throws IOException {
        {
            InputStream stream = System.in;
            Scanner console = new Scanner(stream);

            System.out.println("Specify the path to the text file:");
            fileAddress = console.nextLine();

            System.out.println("Specify the path where to write the cipher:");
            encryptedFileAddress = console.nextLine();

            System.out.println("Enter the key for encoding:");
            key = console.nextByte();
        }

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
            throw new IOException();
//            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
