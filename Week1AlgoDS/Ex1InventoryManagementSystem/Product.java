package Week1AlgoDS.Ex1InventoryManagementSystem;

public class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }


    public String getProductId() { return productId; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return productId + " | " + productName + " | Quantity: " + quantity + " | Price: ₹" + price;
    }
}
