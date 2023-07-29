package org.example.map.mapTask1;

public class Toy {

    private String name;
    private int forAge;
    private int price;

    public Toy(String name, int forAge, int price) {
        this.name = name;
        this.forAge = forAge;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForAge() {
        return forAge;
    }

    public void setForAge(int forAge) {
        this.forAge = forAge;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", forAge=" + forAge +
                ", price=" + price +
                '}';
    }
}
