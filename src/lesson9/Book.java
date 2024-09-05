package lesson9;

import java.util.Objects;

public class Book extends PrintEdition{

    private String author;

    public Book() {
    }

    public Book(String title, int yearOfPublishing, String publisher, int countOfPages, String author) {
        super(title, yearOfPublishing, publisher, countOfPages);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(author);
        return result;
    }

    @Override
    public String toString() {
        return "Книга {Название: "+this.getTitle()+
                ", год выпуска: "+this.getYearOfPublishing()+
                ", Издательство: "+this.getPublisher()+
                ", Количество страниц: "+this.getCountOfPages()+
                ", Автор: "+this.getAuthor()+"}";
    }
}
