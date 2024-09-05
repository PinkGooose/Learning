package lesson15.Homework.Function;

import java.util.function.Function;

public class ConvertStringToIntegerDigitFunction implements Function<String, Integer> {
    @Override
    public Integer apply(String number) {
        switch (number) {
            case "Ноль":
                return 0;
            case "Один":
                return 1;
            case "Два":
                return 2;
            case "Три":
                return 3;
            case "Четыре":
                return 4;
            case "Пять":
                return 5;
            case "Шесть":
                return 6;
            case "Семь":
                return 7;
            case "Восемь":
                return 8;
        }
        return 9;
    }
}
