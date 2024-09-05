package lesson15.Homework.Predicate;

import java.util.function.Predicate;

public class IsAdmin implements Predicate<String> {
    @Override
    public boolean test(String login) {
        return login.equalsIgnoreCase("Максим");
    }
}
