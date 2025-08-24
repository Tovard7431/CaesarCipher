import java.io.*;
import java.util.Scanner;
//Отвечает за чтение и запись файлов.

public class FileManager {
    public boolean readFile() {
        byte key = 0;
        String fileAddress = "";
        String encryptedFileAddress = "";


        InputStream stream = System.in;
        Scanner console = new Scanner(stream);

        try {
            System.out.println("Specify the path to the text file:");
            fileAddress = console.nextLine();
        } catch (Exception e) {
            System.err.println("Error reading path: " + e.getMessage());
        }

        try {
            System.out.println("Specify the path where to write the cipher:");
            encryptedFileAddress = console.nextLine();
        } catch (Exception e) {
            System.err.println("Error reading path: " + e.getMessage());
        }

        try {
            System.out.println("Enter the key for encoding:");
            key = console.nextByte();
        } catch (Exception e) {
            System.err.println("Error reading key: " + e.getMessage());
        }


        try (FileReader reader = new FileReader(fileAddress);
             StringWriter writer = new StringWriter();
             OutputStream in = new FileOutputStream(encryptedFileAddress)) {

            char[] buffer = new char[1024];
            int charsRead;

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
            System.err.println("Ошибка при чтении файла: " + e.getMessage());

        }
        return false;
    }
}
