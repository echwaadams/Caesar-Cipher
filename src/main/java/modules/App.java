package modules;

import java.util.Scanner;

public class App {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encoding(String pText, int Key){
        pText = pText.toLowerCase();
        String cText = " ";
        for (int i = 0; i < pText.length(); i++){
            int charIndexed = alphabet.indexOf(pText.charAt(i));
            int newIndex = (charIndexed+ Key) % 26;
            char cipheredChar = alphabet.charAt(newIndex);
            cText = cText + cipheredChar;
        }
        return cText;
    }
    public static String decoding(String cText, int Key){
        cText = cText.toLowerCase();
        String pText = " ";
        for (int i = 0; i < cText.length(); i++){
            int charIndexed = alphabet.indexOf(cText.charAt(i));
            int newIndex = (charIndexed - Key) % 26;
            if (newIndex < 0){
                newIndex = alphabet.length() + newIndex;
            }
            char plainchar = alphabet.charAt(newIndex);
            pText = pText + plainchar;
        }
        return pText;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("**************************************************");
        System.out.println("Welcome To Caesar Cipher commandline Application!");
        System.out.println("**************************************************");

        System.out.println("Enter plain text to be Encrypted >>");
        String plain = scan.nextLine();

        System.out.println("Enter key >> ");
        int Key = Integer.parseInt(scan.nextLine());

        String cipherText = encoding(plain, Key);

        System.out.println("The cipher text is: " + cipherText);
        System.out.println("The decoded message is : " + decoding(cipherText, Key));
    }
}
