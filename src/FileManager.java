import java.io.InputStream;
import java.util.Scanner;
//Отвечает за чтение и запись файлов.

public class FileManager {
    public String readFile(String filePath) {
        InputStream stream = System.in;
        Scanner console = new Scanner(stream);
        System.out.println("Specify the path to the text file");
        String fileAddress = console.nextLine();
        System.out.println("Where should I write your ciphertext?");
        String encryptedFileAddress = console.nextLine();


        return null;
    }
    public void writeFile(String content, String filePath) {
        // Логика записи файла
        return;
    }
}
