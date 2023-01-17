public class Main {
    public static void main(String[] args) {
        // First Customer
        Customer customer = new Customer("Tim", 5000, "tim@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        // Second Customer
        Customer secondCustomer  = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        // Third Customer
        Customer thirdCustomer  = new Customer("Joe", "joe@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());
    }
}