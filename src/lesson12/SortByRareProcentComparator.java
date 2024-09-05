package lesson12;

import java.util.Comparator;

public class SortByRareProcentComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {

        if(o1.getRareProcent() != o2.getRareProcent()) {
            return o1.getRareProcent() - o2.getRareProcent();
        }

        if(o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }

        if(o1.getNominal() != o2.getNominal()) {
            return o1.getNominal() - o2.getNominal();
        }

        if(!o1.getNameMetal().equals(o2.getNameMetal())) {
            return o1.getNameMetal().compareTo(o2.getNameMetal());
        }
        return Double.compare(o1.getDiameter(), o2.getDiameter());

    }
}
