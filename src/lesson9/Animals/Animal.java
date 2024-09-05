package lesson9.Animals;

import java.util.Objects;

public abstract class Animal {

    private int age;
    private String breed;

    public Animal() {
    }

    public Animal(int age, String breed) {
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public abstract void voice();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(breed, animal.breed);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + Objects.hashCode(breed);
        return result;
    }


}
