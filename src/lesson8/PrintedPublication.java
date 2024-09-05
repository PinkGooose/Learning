package lesson8;

public class PrintedPublication {

    private String title;
    private int year;
    private String publisher;

    public PrintedPublication() {
    }

    public PrintedPublication(String title, int year, String publisher) {
        this.title = title;
        this.year = year;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Печатное издание: " +
                "Название: '" + title + '\'' +
                ", Год: " + year +
                ", Издательство: '" + publisher + '\'' +
                '.';
    }
}
