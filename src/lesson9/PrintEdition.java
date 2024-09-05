package lesson9;

import java.util.Objects;

public class PrintEdition {

    private String title;
    private int yearOfPublishing;
    private String publisher;
    private int countOfPages;

    public PrintEdition() {
    }

    public PrintEdition(String title, int yearOfPublishing, String publisher, int countOfPages) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.publisher = publisher;
        this.countOfPages = countOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintEdition that = (PrintEdition) o;
        return yearOfPublishing == that.yearOfPublishing && countOfPages == that.countOfPages && Objects.equals(title, that.title) && Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + yearOfPublishing;
        result = 31 * result + Objects.hashCode(publisher);
        result = 31 * result + countOfPages;
        return result;
    }

    @Override
    public String toString() {
        return "PrintEdition{" +
                "title='" + title + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", publisher='" + publisher + '\'' +
                ", countOfPages=" + countOfPages +
                '}';
    }
}
