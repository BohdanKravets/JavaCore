package hw1;

public class Flat {
   private int roomsNum;
   private double price;
   private double area;

    public Flat(){}

    public Flat(int roomsNum, double price, double area) {

        this.roomsNum = roomsNum;
        this.price = price;
        this.area = area;
    }

    public int getRoomsNum() {
        return this.roomsNum;
    }

    public double getArea() {
        return this.area;
    }

    public double getPrice() {
        return this.price;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double pricePerMeter(){
        return this.price/this.area;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "roomsNum=" + roomsNum +
                ", price=" + price +
                ", area=" + area +
                '}';
    }
}
