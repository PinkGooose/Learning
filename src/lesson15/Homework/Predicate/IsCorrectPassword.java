package lesson15.Homework.Predicate;

import java.util.function.Predicate;

public class IsCorrectPassword implements Predicate<String> {
    @Override
    public boolean test(String password) {
        return password.equals("GhridjHfi35647");
    }
}
