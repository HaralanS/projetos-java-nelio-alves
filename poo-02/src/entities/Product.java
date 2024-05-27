package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {

        return (quantity * price);
    }

    public void addProduct(int quant) {
        quantity += quant;
    }

    public void removeProduct(int quant) {
        quantity -= quant;
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) +
                ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
