package lesson8;

public class MainHW {
    public static void main(String[] args) {

        PrintedPublication[] library = new PrintedPublication[5];

        Book book1 = new Book("451 по Фаренгейту", 2023, "Магистраль", "Рей Бредбери", 317);
        Book book2 = new Book("Мастер и маргарита", 2002, "Азбука-классика", "Булгаков М.А.", 412);
        Book book3 = new Book("Белая гвардия", 2023, "Азбука-классика", "Булгаков М.А.", 316);
        Magazine magazine1 = new Magazine("Мода для полных", 2024, "Burda", 1);
        Magazine magazine2 = new Magazine("Шить легко и быстро", 2020, "Burda", 2);

        library[0] = book1;
        library[1] = magazine1;
        library[2] = magazine2;
        library[3] = book3;
        library[4] = book2;

        for (int i = 0; i < library.length; ++i) System.out.println(library[i]);
    }
}
