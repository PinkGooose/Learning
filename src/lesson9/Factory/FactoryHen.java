package lesson9.Factory;

public class FactoryHen {

    public void getHen(String country){

        if (country == "Россия") {
            RussianHen chicken = new RussianHen();
            System.out.println(chicken.getDescription());
        } else if(country == "Украина") {
            UkrainianHen chicken = new UkrainianHen();
            System.out.println(chicken.getDescription());
        } else if(country == "Молдова") {
            MoldovanHen chicken = new MoldovanHen();
            System.out.println(chicken.getDescription());
        } else if(country == "Беларусь") {
            BelarussiaHen chicken = new BelarussiaHen();
            System.out.println(chicken.getDescription());
        } else {
            System.out.println("Кур такой страны нет на фабрике!");
        }


    }

}
