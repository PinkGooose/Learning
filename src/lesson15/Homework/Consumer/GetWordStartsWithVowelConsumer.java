package lesson15.Homework.Consumer;

import java.util.function.Consumer;

public class GetWordStartsWithVowelConsumer implements Consumer<String[]> {
    @Override
    public void accept(String[] words) {
        for (String word: words) {
            if (word.startsWith("а") || word.startsWith("у") || word.startsWith("е") || word.startsWith("о") ||
                    word.startsWith("э") || word.startsWith("я") || word.startsWith("и") || word.startsWith("ю")) {
                System.out.println(word);
            }
        }
    }
}
