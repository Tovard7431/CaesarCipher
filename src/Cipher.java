public class Cipher {
    static char[] cipher(char[] cipher, byte key) {
        char[] answer = new char[cipher.length];

        for (var i = 0; i < cipher.length; i++) {
            if (cipher[i] >= 65 && cipher[i] <= 90) {
                int j = cipher[i] + key;
                if (j > 90) {
                    answer[i] = (char) (65 + (j - 90 - 1));
                } else {
                    answer[i] = (char) j;
                }
            } else if (cipher[i] >= 97 && cipher[i] <= 122) {
                int j = cipher[i] + key;
                if (j > 122) {
                    answer[i] = (char) (97 + (j - 122 - 1));
                } else {
                    answer[i] = (char) j;
                }
            } else {
                answer[i] = cipher[i];
            }
        }
        return answer;
    }
}