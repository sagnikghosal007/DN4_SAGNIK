package Week1AlgoDS.Ex1InventoryManagementSystem;

public class Test {
    public static void main(String[] args) {
        Inventory inventory=new Inventory();

        Product p1 = new Product("P1","TShirt",100,799);
        Product p2 = new Product("P2","Kurta",34,1899);
        Product p3 = new Product("P3","Crop Top",67,1299);
        Product p4 = new Product("P4","Saree",23,4599);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.displayInventory();

        System.out.println("\nUpdating TShirt...");
        inventory.updateProduct("P1", 15, 499);
        inventory.displayInventory();

        System.out.println("\nDeleting Kurta...");
        inventory.deleteProduct("P2");
        inventory.displayInventory();
    }

}
