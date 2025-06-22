package Week1AlgoDS.Ex6LibraryManagementSystem;

public class LibraryManagementSystemTest {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book(1, "Java The Complete Reference", "Hebert S"));
        lib.addBook(new Book(2, "DataBase Systems Concepts", "Korth"));
        lib.addBook(new Book(3, "Data Communication and Networking", "Forouzon"));

        System.out.println("Linear Search:");
        Book linear = lib.linearSearchByTitle("Data Communication and Networking");
        if (linear != null) linear.display();

        System.out.println("\nBinary Search:");
        Book binary = lib.binarySearchByTitle("Java The Complete Reference");
        if (binary != null) binary.display();
    }
}
