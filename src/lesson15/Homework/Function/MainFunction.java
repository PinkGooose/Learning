package lesson15.Homework.Function;

public class MainFunction {
    public static void main(String[] args) {
        int[] nums = {5, -8, 0, -9, -4, 4, 3, -11};
        String[] names= {"Наталья", "Иван", "Анатолий", "Максим", "Юлия", "Евгения", "Стас", "Егор", "Владимир", "Илья", "Николай"};

        CountOfPositiveNumFunction counter = new CountOfPositiveNumFunction();
        System.out.println("Количество положительных чисел в массиве:");
        System.out.println(counter.apply(nums));

        System.out.println();
        SumOfMassiveFunction sum = new SumOfMassiveFunction();
        System.out.println("Сумма всех чисел массива:");
        System.out.println(sum.apply(nums));

        System.out.println();
        CountOfNameStartsWithVowelFunction countOfName = new CountOfNameStartsWithVowelFunction();
        System.out.println("Количество имен начинающихся с гласной буквы:");
        System.out.println(countOfName.apply(names));

        System.out.println();
        ConvertStringToIntegerDigitFunction converter = new ConvertStringToIntegerDigitFunction();
        System.out.println(converter.apply("Девять"));
    }
}
