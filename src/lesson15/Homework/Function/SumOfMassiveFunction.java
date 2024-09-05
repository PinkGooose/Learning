package lesson15.Homework.Function;

import java.util.function.Function;

public class SumOfMassiveFunction implements Function<int[], Integer> {
    @Override
    public Integer apply(int[] massive) {
        int sumOfMassive = 0;
        for (int number: massive) {
            sumOfMassive += number;
        }
        return sumOfMassive;
    }
}
