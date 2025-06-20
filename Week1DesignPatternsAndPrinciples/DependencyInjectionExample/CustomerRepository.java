package Week1DesignPatternsAndPrinciples.DependencyInjectionExample;

public interface CustomerRepository {
    Customer findCustomerById(int id);
}

