package practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
//    Створити список з 20 об'єктів.
//    Далі
//1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//            2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//    та країну виробник Китай
//3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//    та країну виробник дисків не Китай
//4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб
//            5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
//            6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
//    та процессор і7 посортувати за ціною


    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer(2000,"IBM",2048,200,
                new HardDrive("Hitachi", HDType.HHD,120.0,Country.INDIA),
                        new Processor(ProcessorType.AMD,1,1666.0,Country.INDIA)));

        computers.add(
                new Computer(
                        2010,
                        "apple",
                        200,
                        200,
                        new HardDrive("seagete", HDType.HHD, 20.0, Country.INDIA),
                        new Processor(ProcessorType.AMD,2,1666.0,Country.INDIA)));
        computers.add(
                new Computer(
                        2011,
                        "IBM",
                        2000,
                        1000,
                        new HardDrive("Hitachi", HDType.SSD, 2000.0, Country.CHINA),
                        new Processor(ProcessorType.INTEL,4,2500.4,Country.INDIA)));

        computers.add(
                new Computer(
                        2015,
                        "Dell",
                        3096,
                        1030,
                        new HardDrive("seagete", HDType.SSD, 203.0, Country.KOREA),
                        new Processor(ProcessorType.INTEL,4,1666.0,Country.KOREA)));
        computers.add(
                new Computer(
                        2009,
                        "apple",
                        18,
                        2000,
                        new HardDrive("seagete", HDType.SSD, 200.0, Country.KOREA),
                        new Processor(ProcessorType.AMD,2,1666.0,Country.INDIA)));

        computers.add(
                new Computer(
                        2020,
                        "IBM",
                        8000,
                        500,
                        new HardDrive("seagete", HDType.HHD, 500.0, Country.USA),
                        new Processor(ProcessorType.AMD,2,1666.0,Country.INDIA)));

        computers.add(
                new Computer(
                        2019,
                        "apple",
                        1000,
                        600,
                        new HardDrive("seagete", HDType.SSD, 20.0, Country.INDIA),
                        new Processor(ProcessorType.AMD,2,1666.0,Country.INDIA)));

        final List<Computer> computersAfter2010 = computers
                .stream()
                .filter(computer -> computer.getYear() > 2010)
                .collect(Collectors.toList());
        System.out.println(computersAfter2010);

        final List<Computer> computersAfter2010s = computers
                .stream()
                .filter(computer -> computer.getYear() > 2010  && computer.getHardDrive().getCountry() == Country.CHINA)
                .collect(Collectors.toList());
        System.out.println(computersAfter2010s);
        final List<Computer> computersAfter2010NotChina = computers
                .stream()
                .filter(computer -> computer.getYear() > 2010  && computer.getHardDrive().getCountry() != Country.CHINA)
                .collect(Collectors.toList());
        System.out.println(computersAfter2010NotChina);

        computers
                .stream()
                .filter(computer -> computer.getHardDrive().getVolume()>500)
                .forEach(System.out::println);

        computers
                .stream()
                .filter(computer -> computer.getHardDrive().getVolume()>500 &&
                        computer.getProcessor().getType() == ProcessorType.INTEL)
                .forEach(System.out::println);

        final List<Computer> collect = computers
                .stream()
                .filter(computer -> computer.getHardDrive().getVolume() > 500 &&
                        computer.getProcessor().getType() == ProcessorType.INTEL)
                .sorted((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()))
                .collect(Collectors.toList());
        System.out.println(collect);

    }


}
