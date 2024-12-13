package lab4;

import java.util.*;

class Article {
    private String name;
    private float price;

    public Article(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Article{name='" + name + "', price=" + price + "}";
    }
}

public class Fifteen_4 {

    public static void main(String[] args) {
        // Створюємо список продуктів
        HashMap<Integer, Article> products = new HashMap<>();
        TreeSet<String> productNames = new TreeSet<>();

        // Додаємо 5 продуктів до магазину
        products.put(1, new Article("Apple", 1.2f));
        products.put(2, new Article("Banana", 0.8f));
        products.put(3, new Article("Orange", 1.5f));
        products.put(4, new Article("Milk", 2.3f));
        products.put(5, new Article("Bread", 1.0f));

        for (Article article : products.values()) {
            productNames.add(article.getName());
        }

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Переглянути список продуктів");
            System.out.println("2. Додати продукт");
            System.out.println("3. Видалити продукт");
            System.out.println("4. Перевірити унікальність найменування");
            System.out.println("5. Вийти");
            System.out.print("Оберіть опцію: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Перегляд продуктів
                    System.out.println("Список продуктів:");
                    for (Map.Entry<Integer, Article> entry : products.entrySet()) {
                        System.out.println("Артикул: " + entry.getKey() + ", " + entry.getValue());
                    }
                    break;
                case 2:
                    // Додавання продукту
                    System.out.print("Введіть артикул: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine(); // Споживаємо залишок рядка
                    if (products.containsKey(newId)) {
                        System.out.println("Продукт із таким артикулом вже існує.");
                        break;
                    }
                    System.out.print("Введіть назву продукту: ");
                    String newName = scanner.nextLine();
                    if (productNames.contains(newName)) {
                        System.out.println("Продукт із такою назвою вже існує.");
                        break;
                    }
                    System.out.print("Введіть ціну продукту: ");
                    float newPrice = scanner.nextFloat();
                    products.put(newId, new Article(newName, newPrice));
                    productNames.add(newName);
                    System.out.println("Продукт додано.");
                    break;
                case 3:
                    // Видалення продукту
                    System.out.print("Введіть артикул продукту для видалення: ");
                    int removeId = scanner.nextInt();
                    if (products.containsKey(removeId)) {
                        Article removed = products.remove(removeId);
                        productNames.remove(removed.getName());
                        System.out.println("Продукт видалено: " + removed);
                    } else {
                        System.out.println("Продукт із таким артикулом не знайдено.");
                    }
                    break;
                case 4:
                    // Перевірка унікальності
                    System.out.print("Введіть назву продукту для перевірки: ");
                    scanner.nextLine(); // Споживаємо залишок рядка
                    String checkName = scanner.nextLine();
                    if (productNames.contains(checkName)) {
                        System.out.println("Продукт із такою назвою вже існує.");
                    } else {
                        System.out.println("Назва продукту унікальна.");
                    }
                    break;
                case 5:
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
