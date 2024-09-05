package lesson14;

import java.util.function.Function;

public class GetFioFunction implements Function<Student, String> {

    @Override
    public String apply(Student student) {
        return student.getName() + " " + student.getSurname() + " " + student.getPatronymic();
    }
}
