package hw1;

public class Car {
   private String model;
   private double power;
   private String color;
   private String type;

    public Car(String model, double power, String color, String type) {
        this.model = model;
        this.power = power;
        this.color = color;
        this.type = type;
    }

    public String getModel(){
        return this.model;
    }

    public double getPower() {
        return this.power;
    }

    public String getColor(){
        return this.color;
    }

    public String getType(){
        return this.type;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setPower(double power){
        this.power = power;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setType(String type){
        this.type = type;
    }

    public void drive(String place){
        System.out.println(this.model + " driving to " + place);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
