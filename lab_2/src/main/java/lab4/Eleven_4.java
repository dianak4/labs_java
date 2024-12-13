package lab4;

import java.util.*;

public class Eleven_4 {

    public static void main(String[] args) {
        // Створюємо множину цілих чисел
        HashSet<Integer> integerSet = new HashSet<>();

        // Додаємо 10 унікальних елементів до множини
        while (integerSet.size() < 10) {
            int randomNum = new Random().nextInt(100); // Діапазон [0, 99]
            integerSet.add(randomNum);
        }

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. Переглянути елементи множини");
            System.out.println("2. Додати елемент");
            System.out.println("3. Видалити елемент");
            System.out.println("4. Відсортувати та переглянути елементи");
            System.out.println("5. Вийти");
            System.out.print("Оберіть опцію: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Перегляд елементів множини
                    System.out.println("Елементи множини: " + integerSet);
                    break;
                case 2:
                    // Додавання елемента
                    System.out.print("Введіть число для додавання: ");
                    int addNum = scanner.nextInt();
                    if (integerSet.add(addNum)) {
                        System.out.println("Число " + addNum + " додано.");
                    } else {
                        System.out.println("Число " + addNum + " вже існує в множині.");
                    }
                    break;
                case 3:
                    // Видалення елемента
                    System.out.print("Введіть число для видалення: ");
                    int removeNum = scanner.nextInt();
                    if (integerSet.remove(removeNum)) {
                        System.out.println("Число " + removeNum + " видалено.");
                    } else {
                        System.out.println("Число " + removeNum + " не знайдено в множині.");
                    }
                    break;
                case 4:
                    // Сортування та перегляд елементів
                    ArrayList<Integer> sortedList = new ArrayList<>(integerSet);
                    Collections.sort(sortedList);
                    System.out.println("Відсортовані елементи: " + sortedList);
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

