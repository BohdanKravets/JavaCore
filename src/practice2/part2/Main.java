package practice2.part2;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {new Guitar(5),new Guitar(6),
                new Drum(20.2),new Trumpet(11.1), new Trumpet(10.1) };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
