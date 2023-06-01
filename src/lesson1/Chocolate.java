package lesson1;

public class Chocolate extends Product {
    private int weight;
    private String taste;

    public Chocolate(String brand, String name, double price, int weight, String taste) {
        super(brand, name, price);
        this.weight = weight;
        this.taste = taste;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %f - %d - %s", brand, name, price, weight, taste);
    }

}