package lab4;

import java.util.*;

public class Twenty_five_4 {

    private Map<Integer, Article> products;

    public Twenty_five_4() {
        products = new HashMap<>();
        // Add default products
        products.put(1, new Article("Laptop", 1200.0f));
        products.put(2, new Article("Mouse", 25.0f));
        products.put(3, new Article("Keyboard", 45.5f));
        products.put(4, new Article("Monitor", 300.0f));
        products.put(5, new Article("Headphones", 75.0f));
    }

    public String viewProducts() {
        StringBuilder result = new StringBuilder("Список товарів:\n");
        for (Map.Entry<Integer, Article> entry : products.entrySet()) {
            result.append("Артикул: ").append(entry.getKey()).append(", ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }

    public String removeProduct(int removeId) {
        if (products.containsKey(removeId)) {
            Article removed = products.remove(removeId);
            return "Товар видалено: " + removed;
        } else {
            return "Товар із таким артикулом не знайдено.";
        }
    }

    public boolean exit() {
        return true;
    }
}
