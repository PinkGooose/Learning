package lesson15.Homework.Function;

import java.util.function.Function;

public class CountOfNameStartsWithVowelFunction implements Function<String[], Integer> {
    @Override
    public Integer apply(String[] names) {
        int countOfName = 0;
        for (String name: names) {
            if (name.startsWith("А") || name.startsWith("У") || name.startsWith("Е") || name.startsWith("О") ||
                    name.startsWith("Э") || name.startsWith("Я") || name.startsWith("И") || name.startsWith("Ю")) {
                countOfName++;
            }
        }
        return countOfName;
    }
}
