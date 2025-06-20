package Week1AlgoDS.Ex1InventoryManagementSystem;

import java.util.HashMap;

public class Inventory {

    private HashMap<String,Product> products=new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, int newQty, double newPrice) {
        if (products.containsKey(productId)) {
            Product p = products.get(productId);
            p.setQuantity(newQty);
            p.setPrice(newPrice);
        } else {
            System.out.println("Product not found.");
        }
    }


    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    public void displayInventory() {
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }


}
