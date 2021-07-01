package practice1;

public class Main {
    public static void main(String[] args) {


        Prince prince = new Prince(1, "Ted", 34.5);

        Cinderella[] cinderellas = {
                new Cinderella(1, "Nata", 36.5),
                new Cinderella(1, "Vika", 35.5),
                new Cinderella(1, "Lesya", 34.5)
        };
        System.out.println(prince.findShoe(cinderellas));

    }
}
