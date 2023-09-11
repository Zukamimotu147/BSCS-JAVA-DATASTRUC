package Activity1;

import java.util.*;

public class Customer extends User {
    private String address;
    private int customerID;
    private Order order = new Order(customerID);
    private Admin admin = new Admin();
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Order> orderHistory = new ArrayList<>();
    

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void placeOrder() {
        System.out.println("\t\t\t\tPlace Order");
        int option;

        do {
            admin.displayProducts();
            System.out.println("\nChoose the following options");
            System.out.println("[1] Add products to order\n[2] Confirm Order\n[3] Exit");
            System.out.print("Option: ");
            option = scan.nextInt();

            switch(option) {
                case 1: 
                    System.out.print("\nEnter product id: ");
                    int id = scan.nextInt(); 
                    order.addProductToOrder(id);
                    System.out.println("Order placed by customer " + username);
                    break;
                case 2: 
                    order.confirmOrder();
                    orderHistory.add(order);
                    return;
            }
        } while (option != 3);
    }

    public void viewOrderHistory() {
        System.out.println("|    \tOrder History \t      |");
        System.out.println("| Order history for customer " + username + " |");
        System.out.println("Addressed to: " + getAddress());
        for (Order order : orderHistory) {
            order.orderDetails(); 
        }
    }
}
