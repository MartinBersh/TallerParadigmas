package Ejer1;

public class Product {

    private String cod;
    private String description;
    private int amount;
    private double price;


    public Product(String cod, String description, int amount, double price) {
        this.cod = cod;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " + '\n' +
                "code='" + cod + '\n' +
                "description='" + description + '\n' +
                "amount=" + amount + '\n' +
                "price=" + price + "\n";
    }
}
