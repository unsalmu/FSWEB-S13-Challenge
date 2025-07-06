package org.example.enums;

public enum Plan {
    BASIC("Basic", 10000),
    STANDARD("Standard", 20000);


    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
