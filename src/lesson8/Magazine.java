package lesson8;

public class Magazine extends PrintedPublication{

    private int number;

    public Magazine(String title, int year, String publisher, int number) {
        super(title, year, publisher);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
