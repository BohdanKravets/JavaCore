package practice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        ZooClub zooClub1 = new ZooClub();
        boolean check = true;
        while (check) {
            System.out.println("Виберіть пункт");
            System.out.println("1) додати учасника в клуб;");
            System.out.println("2) додати тваринку до учасника клубу;");
            System.out.println("3) видалити тваринку з власника.");
            System.out.println("4) Показати тварин учасника.");
            System.out.println("5) Показати учасників клубу.");
            System.out.println("6) Exit.");

            String choose = scannerString.nextLine();

            switch (choose) {
                case "1":
                    System.out.println("Введіть імя учасника");
                    String memberName = scannerString.nextLine();

                    System.out.println("Введіть вік учасника");
                    int memberAge = scannerInt.nextInt();

                    zooClub1.addMember(new Member(memberName, memberAge));
                    break;
                case "2":
                    System.out.println("Виберіть номер учасника");
                    zooClub1.printMembers();
                    int number = scannerInt.nextInt();

                    if (number < zooClub1.getMemberList().size() && number > 0) {
                        System.out.println("Виберіть кличку тварини");
                        String animalName = scannerString.nextLine();
                        zooClub1.getMemberList().get(number - 1).addAnimal(new Animal(animalName));
                    } else {
                        System.out.println("В зооклубі немає такого учасника");
                    }
                    break;

                case "3": {

                    System.out.println("Виберіть номер учасника");
                    zooClub1.printMembers();
                    int memberNumber = scannerInt.nextInt();
                    if (memberNumber < zooClub1.getMemberList().size() && memberNumber > 0) {
                        System.out.println("Виберіть номер тварини");
                        zooClub1.getMemberList().get(memberNumber - 1).printAnimals();
                        int animalNumber = scannerInt.nextInt();
                        if (animalNumber < zooClub1.getMemberList().get(memberNumber - 1).getAnimalList().size()) {
                            zooClub1.getMemberList().get(memberNumber - 1).removeAnimal(animalNumber - 1);
                        } else {
                            System.out.println("В учасника немає такої тварини");
                        }
                    } else {
                        System.out.println("Немає такого учасника");

                    }
                    break;
                }
                case "4": {
                    System.out.println("Виберіть номер учасника");
                    zooClub1.printMembers();
                    int memberNumber = scannerInt.nextInt();
                    zooClub1.getMemberList().get(memberNumber - 1).printAnimals();
                    break;
                }
                case "5": {
                    zooClub1.printMembers();
                    break;
                }
                case "6": {
                    check = false;
                    break;
                }

            }


        }

    }
}
