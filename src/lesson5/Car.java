package lesson5;

public class Car {
    private String brand;
    private int Price;

    public Car() {
    }

    public Car(String brand, int price) {
        this.brand = brand;
        Price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", Price=" + Price +
                '}';
    }
}
