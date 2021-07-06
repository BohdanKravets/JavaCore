package hw5;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        final Cinema cinema = new Cinema(new Time(9, 0), new Time(20, 0));


        cinema.addSeance("monday",
                new Seance(
                        new Movie("state", new Time(1, 30)),
                        new Time(10, 20)));
        cinema.addSeance("monday",
                new Seance(
                        new Movie("state", new Time(1, 30)),
                        new Time(17, 30)));

        cinema.addSeance("monday",
                new Seance(
                        new Movie("state", new Time(1, 30)),
                        new Time(15, 30)));


        ArrayList<Seance> seances = new ArrayList<>();
        seances.add(new Seance(
                new Movie("asd", new Time(1, 30)),
                new Time(15, 30)));
        seances.add(new Seance(
                new Movie("qwe", new Time(1, 30)),
                new Time(16, 30)));
        seances.add(new Seance(
                new Movie("rty", new Time(1, 30)),
                new Time(17, 30)));
        cinema.addSeances("monday",seances);
        cinema.addSeance("tuesday",new Seance(
                new Movie("qwe", new Time(1, 30)),
                new Time(17, 30)));



        System.out.println(cinema);

    }
}
