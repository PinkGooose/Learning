package lesson9.Animals;

import lesson9.ZooAnimal;

public class Tiger extends Animal implements ZooAnimal {

    @Override
    public void voice() {
        System.out.println("РРРрррррррррррррррррр");
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает");
    }

    @Override
    public void climb() {
        System.out.println("Тигр лазит");
    }
}
