package lesson15.Homework.Consumer;

import java.util.function.Consumer;

public class PrintConsoleConsumer implements Consumer<String[]> {
    @Override
    public void accept(String[] words) {
        for (String word: words) {
            System.out.println(word);
        }
    }
}
