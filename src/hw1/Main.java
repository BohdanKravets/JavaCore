package hw1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1,"John","doe",88,true,new String[]{"html","css"});
        System.out.println(user1);

        User user2 = new User();
user2.setId(5);
user2.setName("Vasya");
user2.setName("pupkin");
user2.setWeight(58.5);
user2.setStatus(true);
user2.setSkills(new String[]{"html","css","php"});
        System.out.println(user2);
        System.out.println(user2.getId());


        String[] skills = {"html", "js"};
        User user3 = new User(1, "kolya", "asdqwe", 54.5, true, skills);
        System.out.println(user3);

        User[] users = {user1, user2, user3};
        String s = Arrays.toString(users);
        System.out.println(s);

        for (User user : users) {
            System.out.println(user);
        }

        //Cars

        Car car1 = new Car("Nissan",100,"red","electric");
        Car car2 = new Car("Toyota",200.5,"green","electric");
        Car car3 = new Car("Mercedes",180.4,"gray","electric");
        car1.drive("Lviv");
        car2.drive("Kyiv");
        car3.drive("Paris");

        //Flats
        Flat flat1 = new Flat(1,15400.5,45);
        Flat flat2 = new Flat(3,53005.6,90);
        Flat flat3 = new Flat(2,36200,63);
        System.out.println("Area per meter price of flat 1 is " + flat1.pricePerMeter());
        System.out.println("Area per meter price of flat 2 is " + flat2.pricePerMeter());
        System.out.println("Area per meter price of flat 3 is " + flat3.pricePerMeter());
    }





}
