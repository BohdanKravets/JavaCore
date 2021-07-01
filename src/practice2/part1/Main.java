package practice2.part1;

public class Main {
    public static void main(String[] args) {
        Printable print[] = {new Book("first"), new Book("second"), new Book("third"), new Magazine(), new Magazine()};

        for (Printable item : print) {
            System.out.println(item);
        }
        System.out.println();
        Magazine.printMagazines(print);
    }
}
