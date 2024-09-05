package lesson15.Homework.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        IsPositive check = new IsPositive();
        System.out.println(check.test(5));
        System.out.println(check.test(-7));

        System.out.println();
        IsAdmin administrator = new IsAdmin();
        if (administrator.test("Егор")) {
            System.out.println("Здравствуйте, Максим! Вам предоставлен доступ ВЕЗДЕ!!!");
        } else {
            System.out.println("Кто вы? Я вас не знаю, уходите...");
        }

        System.out.println();
        IsCorrectCode code = new IsCorrectCode();
        System.out.println("Введите четырехзначный код:");
        if (code.test(1234)) {
            System.out.println("Код верный, сейф открыт!");
        } else {
            System.out.println("Код набран неправильно, блокировка сейфа и вызов полиции...");
        }

        System.out.println();
        IsCorrectPassword password = new IsCorrectPassword();
        System.out.println("Введите пароль:");
        if (password.test("jhfkld")) {
            System.out.println("Пароль верный. Добро пожаловать!");
        } else {
            System.out.println("Пароль неверен. Вход заблокирован на 5 минут!");
        }
    }
}
