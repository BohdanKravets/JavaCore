package hw5;


import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        final Cinema cinema = new Cinema(new Time(9, 0), new Time(20, 0));

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        boolean check = true;
        while (check) {
            System.out.println("Виберіть пункт");
            System.out.println("1) Додати сеанс в кінотеатр на певний день ");
            System.out.println("2) Додати кілька сеансів на певний день");
            System.out.println("3) Видалити фільм з усіх розкладів");
            System.out.println("4) Видалити сеанс фільму в певний день");
            System.out.println("5) Показати розклад фільмів на тиждень учасника.");
            System.out.println("6) Exit.");

            String choose = scannerString.nextLine();
            switch (choose) {
                case "1": {
                    System.out.println("Введіть день тижня:(Monday, Tuesday, Wednesday, Thursday, Friday)");
                    String day = scannerString.nextLine();
                    System.out.println("Введіть назву фільму:");
                    String title = scannerString.nextLine();
                    System.out.println("Введіть тривалість фільму: hh:mm");
                    String filmDurationStr = scannerString.nextLine();
                    LocalTime filmDuration = LocalTime.parse(filmDurationStr);

                    System.out.println("Введіть час початку сеансу: ");
                    String filmStartStr = scannerString.nextLine();
                    LocalTime filmStart = LocalTime.parse(filmStartStr);
                    cinema.addSeance(day,
                            new Seance(
                                    new Movie(title, new Time(filmDuration.getHour(), filmDuration.getMinute())),
                                    new Time(filmStart.getHour(), filmStart.getMinute())));
                    break;
                }
                case "2": {
                    System.out.println("Введіть кількість сеансів");
                    ArrayList<Seance> seanceList = new ArrayList<>();
                    int seanceCount = scannerInt.nextInt();
                    System.out.println("Введіть день тижня:(Monday, Tuesday, Wednesday, Thursday, Friday)");
                    String day = scannerString.nextLine();
                    for (int i = 0; i < seanceCount; i++) {
                        System.out.println("Введіть назву фільму:" + (i+1));
                        String title = scannerString.nextLine();
                        System.out.println("Введіть тривалість фільму: hh:mm");
                        String filmDurationStr = scannerString.nextLine();
                        LocalTime filmDuration = LocalTime.parse(filmDurationStr);
                        System.out.println("Введіть час початку сеансу: ");
                        String filmStartStr = scannerString.nextLine();
                        LocalTime filmStart = LocalTime.parse(filmStartStr);
                        seanceList.add(new Seance(
                                new Movie(title, new Time(filmDuration.getHour(), filmDuration.getMinute())),
                                new Time(filmStart.getHour(), filmStart.getMinute())));
                    }

                    cinema.addSeances(day, seanceList);
                    break;
                }
                case "3": {
                    System.out.println("Введіть назву фільму:");
                    System.out.println(cinema);
                    String title = scannerString.nextLine();
                    cinema.removeMovie(title);
                    break;
                }
                case "4": {
                    System.out.println(cinema);
                    System.out.println("Введіть день тижня");
                    String day = scannerString.nextLine();

                    System.out.println("Введіть час початку сеансу: ");
                    String filmStartStr = scannerString.nextLine();
                    LocalTime filmStart = LocalTime.parse(filmStartStr);

                    cinema.removeSeance(day,
                            new Seance(
                                    new Movie("",
                                            new Time(1, 10)),
                                    new Time(filmStart.getHour(), filmStart.getMinute())));

                    break;
                }
                case "5": {
                    System.out.println(cinema);
                    break;
                }
                case "6": {
                    check = false;
                    break;
                }
            }
        }


//

    }
}
