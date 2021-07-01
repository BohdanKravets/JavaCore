package practice3;

import java.util.Scanner;

//Створити  Зооклуб.
//        В мейн методі створити меню, яке буде реалізовувати наступні функції:
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) вивести усіх тваринок конкретного власника
//        6) вивести на екран зооклуб.

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
            System.out.println("4) видалити учасника клубу.");
            System.out.println("5) Показати тварин учасника.");
            System.out.println("6) Показати учасників клубу.");
            System.out.println("7) Exit.");

            String choose = scannerString.nextLine();

            switch (choose) {
                case "1": {
                    System.out.println("Введіть імя учасника");
                    String memberName = scannerString.nextLine();

                    System.out.println("Введіть вік учасника");
                    int memberAge = scannerInt.nextInt();

                    zooClub1.addMember(new Member(memberName, memberAge));
                    break;
                }
                case "2": {
                    System.out.println("Виберіть номер учасника");
                    zooClub1.printMembers();
                    if (zooClub1.getMemberList().size() == 0) {
                        break;
                    }
                    int memberNumber = scannerInt.nextInt();

                    if ((memberNumber - 1) < zooClub1.getMemberList().size() && memberNumber > 0) {
                        System.out.println("Виберіть кличку тварини");
                        String animalName = scannerString.nextLine();
                        zooClub1.getMemberList().get(memberNumber - 1).addAnimal(new Animal(animalName));
                    } else {
                        System.out.println("В зооклубі немає такого учасника");
                    }
                    break;
                }
                case "3": {

                    System.out.println("Виберіть номер учасника клубу");
                    zooClub1.printMembers();

                    if (zooClub1.getMemberList().size() == 0) {
                        break;
                    }

                    int memberNumber = scannerInt.nextInt();
                    if ((memberNumber - 1) < zooClub1.getMemberList().size() && memberNumber > 0) {
                        System.out.println("Виберіть номер тварини");
                        zooClub1.getMemberList().get(memberNumber - 1).printAnimals();
                        if (zooClub1.getMemberList().get(memberNumber - 1).getAnimalList().size() == 0) {
                            break;
                        }

                        int animalNumber = scannerInt.nextInt();
                        if ((animalNumber - 1) < zooClub1.getMemberList().get(memberNumber - 1).getAnimalList().size() && animalNumber > 0) {
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
                    System.out.println("Виберіть номер учасника клубу");
                    zooClub1.printMembers();

                    if (zooClub1.getMemberList().size() == 0) {
                        break;
                    }

                    int memberNumber = scannerInt.nextInt();
                    zooClub1.removeMember(memberNumber);
                    break;
                }


                case "5": {
                    System.out.println("Виберіть номер учасника");
                    zooClub1.printMembers();
                    if (zooClub1.getMemberList().size() == 0) {
                        break;
                    }

                    int memberNumber = scannerInt.nextInt();

                    if ((memberNumber - 1) < zooClub1.getMemberList().size() && memberNumber > 0) {
                        zooClub1.getMemberList().get(memberNumber - 1).printAnimals();
                    } else {
                        System.out.println("В клубі немає такого учасника");
                    }

                    break;
                }
                case "6": {
                    zooClub1.printMembers();
                    break;
                }
                case "7": {
                    check = false;
                    break;
                }

            }


        }

    }
}
