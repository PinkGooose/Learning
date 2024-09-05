package lesson15.Homework.Function;

import java.util.List;
import java.util.function.Function;

public class CountOfPositiveNumFunction implements Function<int[], Integer> {
    @Override
    public Integer apply(int[] massive) {
        int countOfPositiveNum = 0;
        for (int number: massive) {
            if (number > 0) {
                countOfPositiveNum++;
            }
        }
        return countOfPositiveNum;
    }
}
