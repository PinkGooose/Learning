package lesson12;

import java.util.Objects;

public class Coin implements Comparable<Coin>{

    private int nominal;
    private int year;
    private String nameMetal;
    private double diameter;
    private int rareProcent;


    public Coin(int nominal, int year, String nameMetal, double diameter, int rareProcent) {
        this.nominal = nominal;
        this.year = year;
        this.nameMetal = nameMetal;
        this.diameter = diameter;
        this.rareProcent = rareProcent;
    }

    public int getRareProcent() {
        return rareProcent;
    }

    public void setRareProcent(int rareProcent) {
        this.rareProcent = rareProcent;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameMetal() {
        return nameMetal;
    }

    public void setNameMetal(String nameMetal) {
        this.nameMetal = nameMetal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;
        return nominal == coin.nominal && year == coin.year && Double.compare(diameter, coin.diameter) == 0 && rareProcent == coin.rareProcent && Objects.equals(nameMetal, coin.nameMetal);
    }


    @Override
    public int hashCode() {
        int result = nominal;
        result = 31 * result + year;
        result = 31 * result + Objects.hashCode(nameMetal);
        result = 31 * result + Double.hashCode(diameter);
        result = 31 * result + rareProcent;
        return result;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", year=" + year +
                ", nameMetal='" + nameMetal + '\'' +
                ", diameter=" + diameter +
                ", rareProcent=" + rareProcent +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        if(this.nominal != o.nominal) {
            return this.nominal - o.nominal;
        }

        if(this.year != o.year) {
            return this.year - o.year;
        }

        if(!this.nameMetal.equals(o.nameMetal)) {
            return this.nameMetal.compareTo(o.nameMetal);
        }
        return Double.compare(this.diameter, o.diameter);
    }
}
