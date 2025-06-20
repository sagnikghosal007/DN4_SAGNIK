##  Components

### 1. `Customer`
- A simple model class representing a customer with `id` and `name`.

### 2. `CustomerRepository` (Interface)
- Declares the method `findCustomerById(int id)` for fetching customer data.

### 3. `CustomerRepositoryImpl`
- Implements the `CustomerRepository` interface.
- Returns mock customer data for demonstration purposes.

### 4. `CustomerService`
- A service layer that **depends on** `CustomerRepository`.
- Uses **constructor injection** to receive its dependency, promoting inversion of control (IoC).

### 5. `Main`
- Instantiates the repository and injects it into the service class.
- Calls the service method to fetch and print customer details.

## Output:
The output of the implementation of Dependancy Injection Example is :

![image](https://github.com/user-attachments/assets/dae6bec0-601f-46a9-98e4-b0ba9dba26ea)
