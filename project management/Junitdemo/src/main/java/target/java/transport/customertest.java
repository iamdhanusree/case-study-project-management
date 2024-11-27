package target.java.transport;

import com.java.transport.customer;

public class customertest {
    public static void main(String[] args) {
        
        System.out.println("Test 1: Creating a Customer and displaying details...");
        customer customer1 = new customer(1, "Jasiya Yasika S", 25, "9876543210", "jasiya@example.com");
        System.out.println("Customer Details: " + customer1);

        
        System.out.println("\nTest 2: Updating Customer details...");
        customer1.setCustomerName("Jasiya Y S");
        customer1.setAge(26);
        customer1.setMobile("9876540000");
        customer1.setEmail("jasiya.updated@example.com");
        System.out.println("Updated Customer Details: " + customer1);

        
        System.out.println("\nTest 3: Creating multiple Customers and displaying their details...");
        customer customer2 = new customer(2, "John Doe", 30, "1234567890", "john.doe@example.com");
        customer customer3 = new customer(3, "Alice Brown", 35, "1122334455", "alice.brown@example.com");

        System.out.println("Customer 2: " + customer2);
        System.out.println("Customer 3: " + customer3);

        
        System.out.println("\nTest 4: Testing getter methods...");
        System.out.println("Customer 1 Name: " + customer1.getCustomerName());
        System.out.println("Customer 2 Age: " + customer2.getAge());
        System.out.println("Customer 3 Mobile: " + customer3.getMobile());
        System.out.println("Customer 1 Email: " + customer1.getEmail());
    }
}
