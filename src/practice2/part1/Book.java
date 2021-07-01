package practice2.part1;

public class Book extends Template implements Printable{

    public Book() {
    }

    public Book(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("book " + super.getName());
    }

    public static void printMagazines(Printable[] printable) {

        for (Printable item : printable) {
            if (item instanceof Magazine) {

                item.print();
            }

        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
