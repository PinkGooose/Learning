package lesson15.Homework.Consumer;

public class MainConsumer {
    public static void main(String[] args) {
        String[] words = {"ручка", "автобус", "удочка", "ремень", "ноготь", "еда", "мясо", "карандаш", "аноним", "абонент", "вода"};

        GetWordStartsWithVowelConsumer wordStartsWithVowel = new GetWordStartsWithVowelConsumer();
        System.out.println("Все слова из массива, начинающиеся на гласную:");
        wordStartsWithVowel.accept(words);

        System.out.println();
        PrintConsoleConsumer printOnConsole = new PrintConsoleConsumer();
        System.out.println("Все элементы массива:");
        printOnConsole.accept(words);


    }
}
