package inttes;

public class Product {
    private final String name;
    private final double price;
    private int quantity;

    
        

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Product(final String name, final double price) {
        this.name = name;
        this.price = price;
    }

    public Product(final String name, final double price, final int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(final int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(final int quantity) {
        this.quantity -= quantity;
    }

  
    
    public String toString() {
        return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
    }











 public double k ;


public double cel (double k){
    return 273 + k;
}
}