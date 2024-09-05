package lesson8;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Tiger tiger = new Tiger();
        Monkey monkey = new Monkey();
        Monkey monkey1 = new Monkey();
        monkey.setAge(12);
        monkey1.setAge(12);
        monkey.setBreed("Горилла");
        monkey1.setBreed("Горилла");

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = monkey;
        animals[2] = tiger;

        //Вызывается меттод equals класса Object
        //В котором реализация такая: monkey == monkey1
        System.out.println(monkey.equals(monkey1));

        System.out.println(monkey.hashCode());
        System.out.println(monkey1.hashCode());

        System.out.println(monkey);

    }
}
