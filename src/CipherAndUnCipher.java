import java.util.ArrayList;
import java.util.List;

public class CipherAndUnCipher {
    FileManager fileManager = new FileManager();
    Alphabet alphabet = new Alphabet();

    public void cipherList(List<String> charList, int key, String encryptedFileAddress) {

        List<String> cipherList = new ArrayList<>();

        for (var i = 0; i < charList.size(); i++) {
            String x = charList.get(i).toLowerCase();

            if (alphabet.booleanEnAlphabet(x) == true) {
                int a = alphabet.hashEnAlphabet(x);
                if ((a + key) > 26) {
                    cipherList.add(alphabet.letterEnAlphabet((a + key) - 26));
                } else {
                    cipherList.add(alphabet.letterEnAlphabet(a + key));
                }
            } else {
                cipherList.add(x);
            }
        }
        fileManager.writeFile(cipherList, encryptedFileAddress);
    }

    public void unCipherList(List<String> charList, int key, String encryptedFileAddress) {
        List<String> unCipherList = new ArrayList<>();


        for (var i = 0; i < charList.size(); i++) {
            String x = charList.get(i).toLowerCase();

            if (alphabet.booleanEnAlphabet(x) == true) {
                int a = alphabet.hashEnAlphabet(x);
                if ((a - key) < 1) {
                    unCipherList.add(alphabet.letterEnAlphabet(26 + (a - key)));
                } else {
                    unCipherList.add(alphabet.letterEnAlphabet(a - key));
                }
            } else {
                unCipherList.add(x);
            }
        }
        fileManager.writeFile(unCipherList, encryptedFileAddress);
    }
}