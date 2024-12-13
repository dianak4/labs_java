package lab4;

import java.util.*;
import lab4.Article;
public class Twenty_five_4 {

    public static void main(String[] args) {
        // Створюємо список товарів
        HashMap<Integer, Article> products = new HashMap<>();

        // Додаємо 5 товарів до магазину
        products.put(1, new Article("Laptop", 1200.0f));
        products.put(2, new Article("Mouse", 25.0f));
        products.put(3, new Article("Keyboard", 45.5f));
        products.put(4, new Article("Monitor", 300.0f));
        products.put(5, new Article("Headphones", 75.0f));

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Переглянути список товарів");
            System.out.println("2. Видалити товар");
            System.out.println("3. Вийти");
            System.out.print("Оберіть опцію: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Перегляд товарів
                    System.out.println("Список товарів:");
                    for (Map.Entry<Integer, Article> entry : products.entrySet()) {
                        System.out.println("Артикул: " + entry.getKey() + ", " + entry.getValue());
                    }
                    break;
                case 2:
                    // Видалення товару
                    System.out.print("Введіть артикул товару для видалення: ");
                    int removeId = scanner.nextInt();
                    if (products.containsKey(removeId)) {
                        Article removed = products.remove(removeId);
                        System.out.println("Товар видалено: " + removed);
                    } else {
                        System.out.println("Товар із таким артикулом не знайдено.");
                    }
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
