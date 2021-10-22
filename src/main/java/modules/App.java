package modules;

public class App {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encoding(String pText, int Key){
        pText = pText.toLowerCase();
        String cText = " ";
        for (int i = 0; i < pText.length(); i++){
            int charIndex = alphabet.indexOf(pText.charAt(i));
            int newIndex = (charIndex + Key) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            cText = cText + cipherChar;
        }
        return cText;
    }
    public static String decoding(String cText, int Key){
        cText = cText.toLowerCase();
        String pText = " ";
        for (int i = 0; i < cText.length(); i++){
            int charIndex = alphabet.indexOf(cText.charAt(i));
            int newIndex = (charIndex - Key) % 26;
            if (newIndex < 0){
                newIndex = alphabet.length() + newIndex;
            }
            char plainchar = alphabet.charAt(newIndex);
            pText = pText + plainchar;
        }
        return pText;

    }
}
