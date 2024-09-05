package lesson9;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", 1980, "МОСКВА", 500, "Толстой");
        Book book2 = new Book("Том Сойер", 1990, "МОСКВА", 127, "Гекельбери");
        Book book3 = new Book("Русалочка", 2000, "МОСКВА", 346, "Алладин");

        Magazine magazine1 = new Magazine("Натали", 2010, "МОСКВА", 19, 12);
        Magazine magazine2 = new Magazine("Бурда", 2020, "МОСКВА", 56, 1);
        Magazine magazine3 = new Magazine("Плейбой", 2015, "МОСКВА", 78, 4);

        PrintEdition[] library = new PrintEdition[6];

        library[0] = magazine1;
        library[1] = book3;
        library[2] = magazine2;
        library[3] = book1;
        library[4] = magazine3;
        library[5] = book2;

        //проход по массиву
        // for each(проход по каждому в стандартном порядке)
        for (PrintEdition pe :library){
            System.out.println(pe.toString()); //проявление полиморфизма
        }

        PrintEdition maxPage = library[0];
        for (PrintEdition pe: library) {
            if (pe.getCountOfPages()>maxPage.getCountOfPages()){
                maxPage = pe;
            }
        }
        System.out.println("Самое толстое издение в библиотеке:");
        System.out.println(maxPage.toString());

    }
}
