package lesson5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static Map<Person, List<Car>> map = new HashMap<>();

    public static void main(String[] args) throws ParseException {

//        Date date = new Date(System.currentTimeMillis());
//        System.out.println(date);

//        String stringDate = "12-01-1995";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm");
//        final Date date = simpleDateFormat.parse(stringDate);
//        System.out.println(date);
//        System.out.println(simpleDateFormat.format(date));

//        Calendar calendar =Calendar.getInstance();
//        calendar.set(2021, Calendar.JUNE,21);
//        System.out.println(calendar.getTime());

//        LocalDate localDate = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//        System.out.println(localDate.toEpochDay());

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Taras", 54));
        personList.add(new Person(2, "Mariya", 35));
        personList.add(new Person(3, "Petro", 40));
        personList.add(new Person(4, "Yulia", 22));


//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        };
//
//        personList.sort((o1, o2) -> o1.getAge()- o2.getAge());
//        personList.sort(Comparator.comparingInt(Person::getAge));
////
////
////        personList.add(new Person(1,"Petro",36));
////
////        for (Person person : personList) {
////            System.out.println(person);
////        }

//        Map<String,Person> map = new TreeMap<>();
//        map.put("first", new Person(1,"Ostap",23));
//        map.put("second", new Person(1,"Yulia",27));
//        map.put("third", new Person(3,"Petro",18));
//        final Person person = map.remove("second");
//        System.out.println(person);
//        final Person person1 = map.get("first");
//        System.out.println(person1);
//
//printMap(map);
        addNewPerson(new Person(1, "Petro", 26));
        addCarToPerson(1, new Car("Audi", 40000));
        addNewPerson(new Person(2, "Marta", 36));
        addCarToPerson(2, new Car("Honda", 36000));
        addCarToPerson(2, new Car("Infinity", 50000));
        printMap(map);
    }

    public static void addNewPerson(Person person) {
        map.put(person, new ArrayList<>());
    }

    public static void addCarToPerson(int id, Car car) {
//        if(map.containsKey(person)){
//        final List<Car> cars = map.get(person);
//        cars.add(car);
//            System.out.println(String.format("Car %s is added to a person %s",car.getBrand(),person.getName()));
//        } else {
//            System.out.println("No such person" + person.getName());
//        }

        final Set<Person> people = map.keySet();
        for (Person chosenPerson : people) {
            if (chosenPerson.getId() == id) {
                final List<Car> cars = map.get(chosenPerson);
                cars.add(car);
                System.out.println(String.format("Car %s is added to a person %s", car.getBrand(), chosenPerson.getName()));
                return;
            }
        }
            System.out.println("No such person");
    }

    public static void deleteCar(int id, Car car) {
        final Set<Person> people = map.keySet();
        for (Person chosenPerson : people) {
            if (chosenPerson.getId() == id) {
                final List<Car> cars = map.get(chosenPerson);
                cars.remove(car);
                System.out.println(String.format("Car %s is removed to a person %s", car.getBrand(), chosenPerson.getName()));
                return;
            }
        }
        System.out.println("No such person");
    }

    public static void printMap(Map<Person, List<Car>> map) {
        final Set<Map.Entry<Person, List<Car>>> set = map.entrySet();
        for (Map.Entry<Person, List<Car>> entry : set) {
            System.out.println(entry.getKey() + ":");
            final List<Car> carList = entry.getValue();
            for (Car car : carList) {
                System.out.println("\t" + car);
            }
        }
    }
}
