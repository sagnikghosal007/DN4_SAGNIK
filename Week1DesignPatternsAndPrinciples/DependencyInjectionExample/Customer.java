package Week1DesignPatternsAndPrinciples.DependencyInjectionExample;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Customer [ID=" + id + ", Name=" + name + "]";
    }
}
