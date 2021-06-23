package hw1;

import java.util.Arrays;

public class User {
    private int id;
    public void setId(int id) {
        if (id < 0) {
            System.out.println("error");
        } else {
            this.id = id;
        }
    }
    public int  getId(){
        return this.id;
    }

    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    private String surname;
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname(){
        return this.surname;
    }

    private double weight;
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight(){
        return this.weight;
    }

    private boolean status;
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean isStatus(){
        return this.status;
    }

    private String[] skills;
    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    public String[] getSkills(){
return this.skills;
    }


    public User() {
    }

    public User(int id, String name, String surname, double weight, boolean status, String[] skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.status = status;
        this.skills = skills;

    }

    public void greetings() {
        System.out.println("Hello, my name is" + this.name + ' ' + this.surname);
    }

    public String greetings(String msg) {
        return msg + "Hello, my name is" + this.name + ' ' + this.surname;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", status=" + status +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
