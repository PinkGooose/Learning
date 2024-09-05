package lesson14;

import java.util.function.Consumer;

public class PrintConsumer implements Consumer<Student> {
    @Override
    public void accept(Student student) {
        System.out.println(student);
    }
}
