package Activity1;

import java.util.*;

public class OnlineRetailSystem {
    public static void main(String[] args) {
        int menu;

        Scanner scan = new Scanner(System.in);
        
        do {
          
          System.out.println("|\t  Online Retail System\t\t|");
          System.out.println("|    Please choose your account type\t|");
          System.out.println("(Main Menu)\n [1] Customer\n [2] Admin\n [3] Exit");
          System.out.print("Option: ");
          menu = scan.nextInt();

          switch(menu) {
            case 1:
              //Customer
              Customer newCustomer = new Customer();

              System.out.println("(Customer Menu)");

              System.out.println("Enter CustomerID: ");
              newCustomer.setUserID(scan.nextInt());
              scan.nextLine();
              
              System.out.println("Enter Username: ");
              newCustomer.setUsername(scan.nextLine());
              
              System.out.println("Enter Email: ");
              newCustomer.setEmail(scan.nextLine());

              System.out.println("Enter Address: ");
              newCustomer.setAddress(scan.nextLine());

              //display Users Credentials
              newCustomer.logIn();

              //Option for Ordering and LogOut (Customer)
              int option1;
              do {
                System.out.println("Choose the following options");
                System.out.println("(Customer Menu)");
                System.out.println(" [1] Order\n [2] View Order History\n [3] LogOut");
                System.out.print("Option: ");
                option1 = scan.nextInt();

                
                switch(option1) {
                  case 1:
                  newCustomer.placeOrder();
                  break;

                  case 2:
                  newCustomer.viewOrderHistory();
                  break;

                  default:
                  newCustomer.logOut();
                }

              } while (option1 != 3);
              break;
              
              
            
            case 2:
              //Admin
              Admin newAdmin = new Admin();

              System.out.println("Enter AdminID: ");
              newAdmin.setUserID(scan.nextInt());
              scan.nextLine();
              
              System.out.println("Enter Username: ");
              newAdmin.setUsername(scan.nextLine());
              
              System.out.println("Enter Email: ");
              newAdmin.setEmail(scan.nextLine());

              System.out.println("Enter Department: ");
              newAdmin.setDepartment(scan.nextLine());
          
              //display Users Credentials
              newAdmin.logIn();
              newAdmin.getDepartment();
              Product product = new Product();
              int option2;
              do {
                System.out.println("Choose the following options");
                System.out.println(" [1] Add Products\n [2] Remove Products\n [3] Manage Inventory\n [4] LogOut");
                System.out.print("Option: ");
                option2 = scan.nextInt();

                
                switch(option2) {
                  case 1:
                  newAdmin.addProduct(product);
                  break;

                  case 2:
                  System.out.println("\nRemove Product");
                  newAdmin.displayProducts();
                  System.out.print("\nEnter product id: ");
                  int productID = scan.nextInt();
                  newAdmin.removeProduct(productID);
                  break;

                  case 3:
                  newAdmin.manageInventory();
                  break;

                  default:
                  newAdmin.logOut();
                }

              } while (option2 != 3);

              
              break;
            default:
              System.out.println("Good Bye");
              return;
              
        }  
        
      } while (menu != 3);  
    }
}
