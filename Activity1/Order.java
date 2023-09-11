package Activity1;

import java.util.Date;
import java.util.ArrayList;

public class Order extends User {
    private static int nextOrderID = 1;
    private int orderID;
    private int customerID;
    private ArrayList<Product> checkOut;
    private ArrayList<Product> products = Admin.getProducts();
    private double totalAmount;
    private Date orderDate;
    
   public Order(int customerID) {
        this.orderID = nextOrderID++;
        this.checkOut = new ArrayList<>();
        this.customerID = getCustomerID();
        this.totalAmount = 0.0;
        this.orderDate = new Date();
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    public int getOrderID() {
        return orderID;
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public double calculateTotalAmount() {
        double totalAmount = 0.0;
        for (Product product : checkOut) {
            totalAmount += product.getPrice();

            
        }
        return this.totalAmount = totalAmount;
    }

    public void addProductToOrder(int productID) {
        for (Product product : products) {
            if(product.getProductID() == productID) {
                checkOut.add(product);
                System.out.println("Product Added");
                break;
            }
        }
    }

    public void checkOut() {
        for (Product product : checkOut) {
            System.out.println(product);
        }
    }

    public ArrayList<Product> confirmOrder() {
        if(checkOut.size() != 0) {
            System.out.println("Order has been confirmed " + orderDate);

            System.out.println("Products Ordered");

            for (Product product : checkOut) {
                System.out.println(product);
            }
            System.out.println("Total Amount: PHP " + calculateTotalAmount());

            return checkOut;
        } else {
            System.out.println("CheckOut is Empty");
            return null;
        }
    }

    public void orderDetails() {
        System.out.println("Customer ID: " + customerID);
        checkOut();
        System.out.println("Order ID: " + getOrderID() + " Total Amount: PHP " + totalAmount);
    }

    
}
