package lesson15.Homework.Supplier;

public class MainSupplier {
    public static void main(String[] args) {
        GetLotoBarrelSupplier number = new GetLotoBarrelSupplier();
        System.out.println("Из мешка достается бочонок номер:");
        System.out.println(number.get());

        System.out.println();

    }
}
