package lesson15.Homework.Predicate;

import java.util.function.Predicate;

public class IsPositive implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        return number > 0;
    }
}
