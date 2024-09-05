package lesson9;

public class Magazine extends PrintEdition{

    private int numberInYear;

    public Magazine() {
    }

    public Magazine(String title, int yearOfPublishing, String publisher, int countOfPages, int numberInYear) {
        super(title, yearOfPublishing, publisher, countOfPages);
        this.numberInYear = numberInYear;
    }

    public int getNumberInYear() {
        return numberInYear;
    }

    public void setNumberInYear(int numberInYear) {
        this.numberInYear = numberInYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;
        return numberInYear == magazine.numberInYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberInYear;
        return result;
    }

    @Override
    public String toString() {
        return "Журнал {Название: "+this.getTitle()+
                ", год выпуска: "+this.getYearOfPublishing()+
                ", Издательство: "+this.getPublisher()+
                ", Количество страниц: "+this.getCountOfPages()+
                ", Номер в году: "+this.getNumberInYear()+"}";
    }
}
