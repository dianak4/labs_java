package lab4;

import java.util.*;

class TextFile {
    private String path;
    private String description;

    public TextFile(String path, String description) {
        this.path = path;
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "TextFile{path='" + path + "', description='" + description + "'}";
    }
}

public class Twenty_nine_4 {

    public static void main(String[] args) {
        // Створюємо список файлів
        HashMap<String, TextFile> files = new HashMap<>();

        // Додаємо 5 файлів до списку
        files.put("file1.txt", new TextFile("C:/Documents", "Description of file 1"));
        files.put("file2.txt", new TextFile("C:/Documents", "Description of file 2"));
        files.put("file3.txt", new TextFile("C:/Projects", "Description of file 3"));
        files.put("file4.txt", new TextFile("D:/Backups", "Description of file 4"));
        files.put("file5.txt", new TextFile("E:/Downloads", "Description of file 5"));

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Переглянути список файлів");
            System.out.println("2. Додати файл");
            System.out.println("3. Вийти");
            System.out.print("Оберіть опцію: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Споживаємо залишок рядка

            switch (choice) {
                case 1:
                    // Перегляд файлів
                    System.out.println("Список файлів:");
                    for (Map.Entry<String, TextFile> entry : files.entrySet()) {
                        System.out.println("Ім'я файлу: " + entry.getKey() + ", " + entry.getValue());
                    }
                    break;
                case 2:
                    // Додавання файлу
                    System.out.print("Введіть ім'я файлу (з розширенням .txt): ");
                    String fileName = scanner.nextLine();
                    if (files.containsKey(fileName)) {
                        System.out.println("Файл із таким ім'ям вже існує.");
                        break;
                    }
                    System.out.print("Введіть шлях до файлу (без імені файлу): ");
                    String filePath = scanner.nextLine();
                    System.out.print("Введіть опис файлу: ");
                    String fileDescription = scanner.nextLine();
                    files.put(fileName, new TextFile(filePath, fileDescription));
                    System.out.println("Файл додано.");
                    break;
                case 3:
                    // Вихід
                    exit = true;
                    System.out.println("Вихід з програми.");
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }

        scanner.close();
    }
}

