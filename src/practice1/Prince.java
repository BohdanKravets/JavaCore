package practice1;

public class Prince extends Human{

    private double foundedShoe;

    public Prince(){}


    public Prince(int id, String name, double foundedShoe) {
        super(id, name);
        this.foundedShoe = foundedShoe;
    }

    public String findShoe(Cinderella[] cinderellas) {
        super.setId(8);
        for (Cinderella cinderella : cinderellas) {
            if (this.foundedShoe == cinderella.getSize()) {
                return cinderella.getName();
            }
        }
        return "No fonded";
    }





    public double getFoundedShoe() {
        return foundedShoe;
    }

    public void setFoundedShoe(double foundedShoe) {
        this.foundedShoe = foundedShoe;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "foundedShoe=" + foundedShoe +
                "} " + super.toString();
    }
}
