import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        fileManager.enterPathAndKey();
        fileManager.readFile();
    }
}
