package practice1;

public class Cinderella extends Human {

    private double size;

    public Cinderella(){}


    public Cinderella(int id, String name, double size) {
        super(id, name);
        this.size = size;
    }

    public double getSize(){
        return this.size;
    }


    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cinderella{" +
                "size=" + size +
                "} " + super.toString();
    }
}
