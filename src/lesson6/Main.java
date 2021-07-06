package lesson6;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Petro","Ukrainian", LocalDate.of(2005, 11, 20)));
        list.add(new Person(2, "Taras","Polish", LocalDate.of(1991, 1, 10)));
        list.add(new Person(3, "Marta","Ukrainian", LocalDate.of(1993, 6, 14)));
        list.add(new Person(4, "Oksana","Polish", LocalDate.of(1991, 1, 10)));
        list.add(new Person(5, "Olenka","Hungarian", LocalDate.of(2000, 3, 18)));

//        Predicate<Person> personBornIn1991 = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getBirthDate().getYear() ==1991;
//            }
//        };
//        System.out.println(personBornIn1991.test(list.get(0)));

//        list.forEach(System.out::println);

//       list.stream().map(new Function<Person, String>() {
//            @Override
//            public String apply(Person person) {
//                return person.getName();
//            }
//        });

//        final List<String> names = list.stream()
//                .map(Person::getName)
//                .collect(Collectors.toList());
//        System.out.println(names);

//        final List<Person> collect = list.stream().sorted(Comparator.comparingInt(o -> o.getBirthDate().getYear())).collect(Collectors.toList());
//        System.out.println(collect);
//        System.out.println(list);

//        final int currentYear = LocalDate.now().getYear();
//        final List<Person> adults = list.stream()
//                .filter(person -> currentYear - person.getBirthDate().getYear() >= 18)
//                .collect(Collectors.toList());
//        System.out.println(adults);


//list.stream().skip(2).forEach(System.out::println);

//        final List<Person> firstNamesWithA = list.stream()
//                .filter(person -> person.getName().contains("a"))
//                .limit(2)
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//
//        firstNamesWithA.forEach(System.out::println);

//        final Optional<Person> max = list.stream()
//                .max((o1, o2) -> o2.getBirthDate().compareTo(o1.getBirthDate()));
//
//        list.stream()
//                .filter(person -> person.getBirthDate()
//                        .equals(max.get().getBirthDate())).forEach(System.out::println);
//        System.out.println(max);

        final Map<String, List<Person>> collect = list.stream().collect(Collectors.groupingBy(Person::getNationality));
collect.entrySet().forEach(System.out::println);
    }
}
