package lesson8;

public class Book extends PrintedPublication{

    private String author;
    private int countPage;

    public Book(String title, int year, String publisher, String author, int countPage) {
        super(title, year, publisher);
        this.author = author;
        this.countPage = countPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }
}
