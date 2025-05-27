public class Bank_customer {
    String custName;
    int customerId;
    String customerAddress;

    public Bank_customer(String custName, int customerId, String customerAddress) {
        this.custName = custName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Address: " + customerAddress);
    }

    public static void main(String[] args) {
        Bank_customer customer = new Bank_customer("Alice", 101, "123 Park Street");
        customer.displayCustomer();
    }
}