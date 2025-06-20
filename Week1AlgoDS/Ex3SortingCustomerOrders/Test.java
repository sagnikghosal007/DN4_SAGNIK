package Week1AlgoDS.Ex3SortingCustomerOrders;

public class Test {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O101", "Sagnik", 1450.0),
                new Order("O102", "Rishi", 56731.0),
                new Order("O103", "Subhro", 8421.0),
                new Order("O104", "Ayush", 8624.0)
        };

        System.out.println("Original Orders:");
        SortOrders.printOrders(orders);

        // Bubble Sort
        System.out.println("\nSorted by Bubble Sort:");
        SortOrders.bubbleSort(orders);
        SortOrders.printOrders(orders);

        // Reset and Quick Sort
        orders = new Order[] {
                new Order("O101", "Sagnik", 1450.0),
                new Order("O102", "Rishi", 56731.0),
                new Order("O103", "Subhro", 8421.0),
                new Order("O104", "Rishi", 8624.0)
        };
        System.out.println("\nSorted by Quick Sort:");
        SortOrders.quickSort(orders, 0, orders.length - 1);
        SortOrders.printOrders(orders);
    }
}
