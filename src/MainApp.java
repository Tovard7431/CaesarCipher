import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        byte key = 9;
        char[] intText = new char[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 33, 44, 65, 97, 97, 122};
        System.out.println(intText);
        System.out.println(Cipher.cipher(intText, key));


    }



}
