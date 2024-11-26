package creational.factorymethod.products;

public abstract class Car {

    private String name;
    private double price;
    private String agency;

    public Car() {
    }

    public Car(String name, double price, String agency) {
        this.name = name;
        this.price = price;
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return String.format("$%.2f", price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Price: " + this.getPrice() + ", Agency: " + this.getAgency();
    }
}
