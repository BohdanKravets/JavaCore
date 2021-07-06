package lesson6;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private  String nationality;
    private LocalDate birthDate;


    public Person() {
    }

    public Person(int id, String name,String nationality, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(nationality, person.nationality) && Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nationality, birthDate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
