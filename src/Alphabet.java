import java.util.HashMap;

public class Alphabet {

        public final int hashEnAlphabet(String letter) {

           HashMap<String, Integer> enAlphabet = new HashMap<>();
           enAlphabet.put("a", 1); enAlphabet.put("b", 2); enAlphabet.put("c", 3);
           enAlphabet.put("d", 4); enAlphabet.put("e", 5); enAlphabet.put("f", 6);
           enAlphabet.put("g", 7); enAlphabet.put("h", 8); enAlphabet.put("i", 9);
           enAlphabet.put("j", 10); enAlphabet.put("k", 11); enAlphabet.put("l", 12);
           enAlphabet.put("m", 13); enAlphabet.put("n", 14); enAlphabet.put("o", 15);
           enAlphabet.put("p", 16); enAlphabet.put("q", 17); enAlphabet.put("r", 18);
           enAlphabet.put("s", 19); enAlphabet.put("t", 20); enAlphabet.put("u", 21);
           enAlphabet.put("v", 22); enAlphabet.put("w", 23); enAlphabet.put("x", 24);
           enAlphabet.put("y", 25); enAlphabet.put("z", 26);

            return enAlphabet.get(letter);
        }

        public final String letterEnAlphabet(int hash){

           HashMap<Integer, String> enAlphabet = new HashMap<>();
            enAlphabet.put(1, "a"); enAlphabet.put(2, "b"); enAlphabet.put(3, "c");
            enAlphabet.put(4, "d"); enAlphabet.put(5, "e"); enAlphabet.put(6, "f");
            enAlphabet.put(7, "g"); enAlphabet.put(8, "h"); enAlphabet.put(9, "i");
            enAlphabet.put(10, "j"); enAlphabet.put(11, "k"); enAlphabet.put(12, "l");
            enAlphabet.put(13, "m"); enAlphabet.put(14, "n"); enAlphabet.put(15, "o");
            enAlphabet.put(16, "p"); enAlphabet.put(17, "q"); enAlphabet.put(18, "r");
            enAlphabet.put(19, "s"); enAlphabet.put(20, "t"); enAlphabet.put(21, "u");
            enAlphabet.put(22, "v"); enAlphabet.put(23, "w"); enAlphabet.put(24, "x");
            enAlphabet.put(25, "y"); enAlphabet.put(26, "z");

            return enAlphabet.get(hash);
        }

        public final boolean booleanEnAlphabet(String letter) {

            HashMap<String, Integer> enAlphabet = new HashMap<>();
            enAlphabet.put("a", 1); enAlphabet.put("b", 2); enAlphabet.put("c", 3);
            enAlphabet.put("d", 4); enAlphabet.put("e", 5); enAlphabet.put("f", 6);
            enAlphabet.put("g", 7); enAlphabet.put("h", 8); enAlphabet.put("i", 9);
            enAlphabet.put("j", 10); enAlphabet.put("k", 11); enAlphabet.put("l", 12);
            enAlphabet.put("m", 13); enAlphabet.put("n", 14); enAlphabet.put("o", 15);
            enAlphabet.put("p", 16); enAlphabet.put("q", 17); enAlphabet.put("r", 18);
            enAlphabet.put("s", 19); enAlphabet.put("t", 20); enAlphabet.put("u", 21);
            enAlphabet.put("v", 22); enAlphabet.put("w", 23); enAlphabet.put("x", 24);
            enAlphabet.put("y", 25); enAlphabet.put("z", 26);

            return enAlphabet.containsKey(letter);
        }

}
