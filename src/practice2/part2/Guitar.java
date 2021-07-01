package practice2.part2;

public class Guitar implements Instrument {
    int stringsNumber;

    public Guitar() {}

    public Guitar(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }

    public int getStringsNumber() {
        return stringsNumber;
    }

    public void setStringsNumber(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }
    @Override
    public void play() {
        System.out.println("Guitar is playing with " + stringsNumber + " strings");
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "count=" + stringsNumber +
                '}';
    }


}
