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

    private Map<Integer, Article> products = new HashMap<>();
    private Set<String> productNames = new TreeSet<>();

    public Fifteen_4() {
        // Initialize with default products
        products.put(1, new Article("Apple", 1.2f));
        products.put(2, new Article("Banana", 0.8f));
        products.put(3, new Article("Orange", 1.5f));
        products.put(4, new Article("Milk", 2.3f));
        products.put(5, new Article("Bread", 1.0f));

        for (Article article : products.values()) {
            productNames.add(article.getName());
        }
    }

    public Map<Integer, Article> getProducts() {
        return new HashMap<>(products);
    }

    public Set<String> getProductNames() {
        return new TreeSet<>(productNames);
    }

    public boolean addProduct(int id, String name, float price) {
        if (products.containsKey(id) || productNames.contains(name)) {
            return false;
        }
        products.put(id, new Article(name, price));
        productNames.add(name);
        return true;
    }

    public boolean removeProduct(int id) {
        if (!products.containsKey(id)) {
            return false;
        }
        Article removed = products.remove(id);
        productNames.remove(removed.getName());
        return true;
    }

    public boolean isNameUnique(String name) {
        return !productNames.contains(name);
    }

}
