package lesson15.Homework.Predicate;

import java.util.function.Predicate;

public class IsCorrectCode implements Predicate<Integer> {
    @Override
    public boolean test(Integer testedCode) {
        return testedCode == 5862;
    }
}
