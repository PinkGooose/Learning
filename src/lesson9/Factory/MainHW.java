package lesson9.Factory;

public class MainHW {
    public static void main(String[] args) {
        FactoryHen factory = new FactoryHen();
        factory.getHen("Россия");
        factory.getHen("Украина");
        factory.getHen("Молдова");
        factory.getHen("Беларусь");
        factory.getHen("США");

    }
}
