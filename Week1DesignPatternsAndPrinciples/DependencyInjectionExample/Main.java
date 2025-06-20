package Week1DesignPatternsAndPrinciples.DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        Customer customer = service.getCustomer(1);
        System.out.println(customer);
    }
}
