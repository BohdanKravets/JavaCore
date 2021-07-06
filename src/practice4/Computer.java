package practice4;

import java.time.LocalDate;

//- модель
//        - рік випуску
//        - об'єм пам'яті
//        - ціна
//        - Жорсткий диск (Класс з полями)
//        - Модель жорсткого диску
//        - Тип (ссд або хдд (енум))
//        - об'єм жорсткого диску
//        - Країна виробник (Енуми. Китай, Корея, Індія, США)
//        - Процессор(Класс)
//        - Тип
//        -кількість ядер
//        -частота
//        -виробник (Енуми ті самі країни)
public class Computer {
    int year;
    String model;
    int memorySize;
    double price;
    HardDrive hardDrive;
    Processor processor;

    public Computer() {
    }

    public Computer(int year, String model, int memorySize, double price, HardDrive hardDrive, Processor processor) {
        this.year = year;
        this.model = model;
        this.memorySize = memorySize;
        this.price = price;
        this.hardDrive = hardDrive;
        this.processor = processor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", memorySize=" + memorySize +
                ", price=" + price +
                ", hardDrive=" + hardDrive +
                ", processor=" + processor +
                '}';
    }
}
