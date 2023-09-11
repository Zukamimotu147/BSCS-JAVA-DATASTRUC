package Activity1;

public class Product {
    private int productID;
    private String name;
    private double price;
    private int stockQuantity;

    Product(int productId, String name, int price, int stockQuantity) {
        this.productID = productId;
        this.name = name;
        this.price = price; 
        this.stockQuantity = stockQuantity;
    }

    Product() { }

    @Override
    public String toString() {
        return "Product ProductID = " + productID + ", Name = " + name + ", Price = " + price + ", Stock Quantity = " + stockQuantity + "";
    }

    public double getPrice() {
        return price;
    }

    public int getProductID() {
        return productID;
    }
    
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void updateStock(int newStockQuantity) {
        this.stockQuantity = newStockQuantity;
    }

    
}