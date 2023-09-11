package Activity1;

import java.util.*;
public class Admin extends User {
    String Department;
    private static ArrayList<Product> products = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    private static boolean firstDisplay = true;

    public String getDepartment() {
        return "Department: " + Department;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    public static ArrayList<Product> getProducts() {
        return products;
    }

    Admin() {
        if(firstDisplay) {
            defaultProducts();
            firstDisplay = false;
        }
    }

    private static Product setProductDetails() {
        System.out.print("Enter product id: ");
        int productId = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter product name: ");
        String name = scan.nextLine();
        System.out.print("Enter price: ");
        int price = scan.nextInt();
        System.out.print("Enter stock quantity: ");
        int stockQuantity = scan.nextInt();
        
        return new Product(productId, name, price, stockQuantity);
    }

    public void addProduct(Product product) {
        System.out.println("\nAdd a product\n");
        product = setProductDetails();
        products.add(product);
        System.out.println("\nProduct added successfully\n");
    }

    public boolean removeProduct(int productId) {
        for (Product product: products) {
            if (product.getProductID() == productId) {
                products.remove(product);
                System.out.println("\nProduct successfully removed");
                return true;
            }
                
            
        }
        System.out.println("Product not found");
        return false;
    }

    public void manageInventory() {
        System.out.println("\t\t -_-_- Manage Inventory -_-_-");

        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("Choose the following\n [1] Update Price\n [2] Update Stock Quantity");
        System.out.print("Option: ");
        int choice = scan.nextInt();

        System.out.println("Enter Product ID: ");
        int prodID = scan.nextInt();

        for (Product product : products) {
            if(product.getProductID() == prodID) {
                switch(choice) {
                    case 1: 
                    System.out.print("Enter new Price: ");
                    int newPrice = scan.nextInt();

                    product.updatePrice(newPrice);
                    break;

                    case 2:
                    System.out.print("Enter new Stock Quantity: ");
                    int newStockQuantity = scan.nextInt();

                    product.updateStock(newStockQuantity);
                    break;
                    
                    default:
                    System.out.println("Invalid Choice");
                }
                return;
            }
        }
    }

    private void defaultProducts() {
        Product product1 = new Product(1, "RTX 4090", 124999, 10);
        Product product2 = new Product(2, "RTX 3090", 88000, 15);
        Product product3 = new Product(3, "RTX 2080", 63890, 20);

        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    public void displayProducts() {
        System.out.println("\t\t\t  -_-_-Product List-_-_-");
        for (Product product: products) {
            System.out.println(product);
        }
    }
}
