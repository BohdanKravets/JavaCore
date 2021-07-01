package practice3;

import java.util.ArrayList;

public class Member {
    private String name;
    private int age;
    private ArrayList<Animal> animalList;

    public Member() {
        this.animalList = new ArrayList<>();

    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
        this.animalList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    public void printAnimals() {
        if (animalList.size() == 0) {
            System.out.println("В учасника клубу немає тварин");
            return;
        }
        System.out.println("Тварини учасника:");
        for (int i =0; i<this.animalList.size();i++) {

            System.out.println((i+1) + ". " + this.animalList.get(i).getName());
        }
    }

    public void addAnimal(Animal animal) {
        this.animalList.add(animal);

    }

    public void removeAnimal(int number) {
        this.animalList.remove(number);

    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", animalList=" + animalList +
                '}';
    }
}
