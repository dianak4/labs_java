package lab3;

import java.util.Scanner;

public class Fifteen_3 {

    // Функція для шифрування тексту
    public static String encrypt(String text, String keyword) {
        StringBuilder result = new StringBuilder();
        int keywordLength = keyword.length();

        // Проходимо по кожному символу тексту
        for (int i = 0; i < text.length(); i++) {
            char textChar = text.charAt(i);
            char keyChar = keyword.charAt(i % keywordLength);

            // Шифруємо, додаючи код символу тексту і гасла
            char encryptedChar = (char) (textChar + keyChar);
            result.append(encryptedChar);
        }

        return result.toString();
    }

    // Функція для розшифрування тексту
    public static String decrypt(String text, String keyword) {
        StringBuilder result = new StringBuilder();
        int keywordLength = keyword.length();

        // Проходимо по кожному символу тексту
        for (int i = 0; i < text.length(); i++) {
            char textChar = text.charAt(i);
            char keyChar = keyword.charAt(i % keywordLength);

            // Розшифровуємо, віднімаючи код символу гасла
            char decryptedChar = (char) (textChar - keyChar);
            result.append(decryptedChar);
        }

        return result.toString();
    }


}
