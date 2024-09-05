package lesson12;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, "Gold", 2.5, 1);
        Coin coin2 = new Coin(5, 1999, "Zemetal", 2.5, 5);
        Coin coin3 = new Coin(10, 1990, "Gold", 2.5, 90);
        Coin coin4 = new Coin(50, 1899, "Lead", 5, 50);
        Coin coin5 = new Coin(5, 1869, "Silver", 10, 24);

        Set<Coin> coinsSortByRare = new TreeSet<>(new SortByRareProcentComparator());
        coinsSortByRare.add(coin1);
        coinsSortByRare.add(coin2);
        coinsSortByRare.add(coin3);
        coinsSortByRare.add(coin4);
        coinsSortByRare.add(coin5);

        System.out.println("Редкость самый приоритетный параметр(1 - очень редкая монета, 100 - попадается везде и всюду):");
        for(Coin coin : coinsSortByRare) {
            System.out.println(coin);
        }

        Set<Coin> coinsSortByRareProcent = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {

                if(o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }

                if(o1.getNominal() != o2.getNominal()) {
                    return o1.getNominal() - o2.getNominal();
                }

                if(!o1.getNameMetal().equals(o2.getNameMetal())) {
                    return o1.getNameMetal().compareTo(o2.getNameMetal());
                }

                if(o1.getDiameter() != o2.getDiameter()) {
                    return Double.compare(o1.getDiameter(), o2.getDiameter());
                }
                return o1.getRareProcent() - o2.getRareProcent();
            }
        });
        coinsSortByRareProcent.add(coin1);
        coinsSortByRareProcent.add(coin2);
        coinsSortByRareProcent.add(coin3);
        coinsSortByRareProcent.add(coin4);
        coinsSortByRareProcent.add(coin5);

        System.out.println("Редкость самый приоритетный параметр(1 - очень редкая монета, 100 - попадается везде и всюду):");
        for(Coin coin : coinsSortByRareProcent) {
            System.out.println(coin);
        }





        /*Set<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for(Coin coin : coins) {
            System.out.println(coin);
        }
        System.out.println("Теперь сортировка по году");

        Set<Coin> coinsSortByYears = new TreeSet<>(new SortByYearComparator());
        coinsSortByYears.add(coin1);
        coinsSortByYears.add(coin2);
        coinsSortByYears.add(coin3);
        coinsSortByYears.add(coin4);
        coinsSortByYears.add(coin5);

        for(Coin coin : coinsSortByYears) {
            System.out.println(coin);
        }
        System.out.println("Сортировка по наименованию металла:");

        Set<Coin> coinsSortByMetalName = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if(!o1.getNameMetal().equals(o2.getNameMetal())) {
                    return o1.getNameMetal().compareTo(o2.getNameMetal());
                }

                if(o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }

                if(o1.getNominal() != o2.getNominal()) {
                    return o1.getNominal() - o2.getNominal();
                }

                return Double.compare(o1.getDiameter(), o2.getDiameter());
            }
        });
        coinsSortByMetalName.add(coin1);
        coinsSortByMetalName.add(coin2);
        coinsSortByMetalName.add(coin3);
        coinsSortByMetalName.add(coin4);
        coinsSortByMetalName.add(coin5);

        for(Coin coin : coinsSortByMetalName) {
            System.out.println(coin);
        }*/


    }
}
