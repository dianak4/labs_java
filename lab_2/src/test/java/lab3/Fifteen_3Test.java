package lab3;

import static org.junit.Assert.*;
import org.junit.Test;

public class Fifteen_3Test {

    @Test
    public void testEncryptAndDecrypt() {
        // Тестові дані
        String text = "hello";
        String key = "key";

        // Шифрування
        String encryptedText = Fifteen_3.encrypt(text, key);
        System.out.println("Зашифрований текст: " + encryptedText);

        // Перевірка, що зашифрований текст не є однаковим з оригінальним
        assertNotEquals(text, encryptedText);

        // Розшифрування
        String decryptedText = Fifteen_3.decrypt(encryptedText, key);
        System.out.println("Розшифрований текст: " + decryptedText);

        // Перевірка, що після розшифрування ми отримали оригінальний текст
        assertEquals(text, decryptedText);
    }

    @Test
    public void testEncryptionWithDifferentKeys() {
        // Тест з іншим гаслом
        String text = "test";
        String key = "abc";

        // Шифрування
        String encryptedText = Fifteen_3.encrypt(text, key);
        System.out.println("Зашифрований текст: " + encryptedText);

        // Перевірка, що зашифрований текст не є однаковим з оригінальним
        assertNotEquals(text, encryptedText);

        // Розшифрування
        String decryptedText = Fifteen_3.decrypt(encryptedText, key);
        System.out.println("Розшифрований текст: " + decryptedText);

        // Перевірка, що після розшифрування ми отримали оригінальний текст
        assertEquals(text, decryptedText);
    }
}
