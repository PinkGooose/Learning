package lesson9.Animals;

import lesson9.ZooAnimal;

public class Monkey extends Animal implements ZooAnimal {

    @Override
    public void voice() {
        System.out.println("УУУУууууууу аааААААааааа");
    }

    @Override
    public void jump() {
        System.out.println("Обезтяна прыгает");
    }

    @Override
    public void climb() {
        System.out.println("Обезьяна лазит");
    }
}
