package practice2.part1;

public class Magazine extends Template implements Printable {


    public Magazine() {
    }

    public Magazine(String name) {
        super(name);
    }

    public static void printMagazines(Printable[] printable) {

        for (Printable item : printable) {
            if (item instanceof Magazine) {

                item.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Magazine");
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
