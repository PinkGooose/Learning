package lesson9.Animals;

public class Zoo {
    public static void main(String[] args) {

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();

        Animal[] animals = new Animal[4];
        animals[0] = monkey1;
        animals[1] = tiger1;
        animals[2] = tiger2;
        animals[3] = monkey2;

        for (Animal a : animals) {
            a.voice(); //проявление полиморфизма
        }

    }
}
