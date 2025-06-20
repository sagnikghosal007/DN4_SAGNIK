package ECommPlatformSearch;

import java.util.*;

public class Main {
    static  class Product {
        int productId;
        String productName;
        String category;

        public Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }

        @Override
        public String toString() {
            return productId + ": " + productName + " [" + category + "]";
        }
    }
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Table", "Furniture"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Headphone", "Accessories"),
                new Product(105, "DSLR Camera", "Electronics"),
                new Product(106, "Washing Machine", "Electronics")
        };

        System.out.println("By Linear Search");
        testSearch(products, "Watch", true);
        testSearch(products, "Tablet", false);

        System.out.println("\n By Binary Search ");
        testBinarySearch(products, "Laptop", true);
        testBinarySearch(products, "Phone", false);
    }

    public static void testSearch(Product[] products, String target, boolean expectedFound) {
        Product res = linearSearch(products, target);
        if ((res != null) == expectedFound) {
            System.out.println("Found: " + target );
        } else {
            System.out.println("Not Found ");
        }
    }
    public static void testBinarySearch(Product[] products, String target, boolean expectedFound) {
        Product res = binarySearch(products.clone(), target);
        if ((res != null) == expectedFound) {
            System.out.println("Found: " + target );
        } else {
            System.out.println("Not Found (Expected " + (expectedFound ? "Found" : "Not Found") + "): " + target);
        }
    }
}