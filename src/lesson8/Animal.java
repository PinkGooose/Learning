package lesson8;

import java.util.Objects;

public class Animal{

    private int age;
    private String name;
    private String breed;

    public Animal() {
    }

    public Animal(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(breed, animal.breed);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(breed);
        return result;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "age = " + age +
                ", name = '" + name + '\'' +
                ", breed = '" + breed + '\'' +
                '}';
    }
}
