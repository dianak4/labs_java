package lab3;

public class Twenty_five_3 {

    // Функція для перевірки, чи є рядок тільки латинськими буквами
    private static boolean isLatinString(String str) {
        return str.matches("[a-zA-Z]+");
    }

    // Функція для перевірки, чи є рядок тільки кирилицею
    private static boolean isCyrillicString(String str) {
        return str.matches("[\u0400-\u04FF]+");
    }

    // Функція для пошуку найбільшого рядка
    public static String findLargestString(String[] args) {
        String largestString = null;

        for (String arg : args) {
            if (isLatinString(arg) || isCyrillicString(arg)) {
                if (largestString == null || arg.length() > largestString.length()) {
                    largestString = arg;
                }
            }
        }

        return largestString;
    }
}
