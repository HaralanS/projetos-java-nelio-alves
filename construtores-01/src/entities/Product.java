package entities;

public class Product {

//    Atributos
    public String name;
    public double price;
    public int quantity;


//    Construtores
    public Product() {}

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
//        quantity = 0;
    }


//    Metodos
    public double totalValueInStock() {

        return (quantity * price);
    }

    public void addProduct(int quant) {
        quantity += quant;
    }

    public void removeProduct(int quant) {
        quantity -= quant;
    }

//     <---- toString  :D ---->
    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) +
                ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }

}
