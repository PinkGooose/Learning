package lesson13;

public class Main1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        // Как будем добавлять
        phoneBook.addAbonent("Женя", "+79871104025");
        phoneBook.addAbonent("Женя", "+33333333333");
        phoneBook.addAbonent("Женя", "+55555555555");
        phoneBook.addAbonent("Петя", "+70000000000");

        System.out.println("Все люди в телефоной книжке с их номерами:");
        phoneBook.printAllAbonents();
        System.out.println();
        System.out.println("Имена, у которых номер телефона начинается на определенную цифру:");
        phoneBook.printAbonentBegginningWith("+7");
        System.out.println();
        System.out.println("Все номера искомого пользователя:");
        phoneBook.printUsersNumbers("Женя");
        phoneBook.printUsersNumbers("Вася");
    }
}
