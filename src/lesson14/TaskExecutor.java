package lesson14;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class TaskExecutor {
    public void execute() {
        var studentList = getStudentList(10);
        studentList.forEach(System.out::println);//упрощенная форма forEach
        // studentList.forEach(new PrintConsumer()::accept); (наш созданный класс PrintConsumer)

        studentList.sort(Comparator.comparing(Student::getSurname));
        studentList.forEach(System.out::println);

        List<Student> filteredList = filterStudents(studentList);
        System.out.println("Студенты, которые прошли отбор:");
        filteredList.forEach(System.out::println);
        System.out.println();
        /*System.out.println("ФИО: средний балл студента");
        printFullNameAverage(studentList);
        System.out.println();
        System.out.println("Все студенты, у которых балл выше 4:");
        printAverageAboveFour(studentList);*/
        Map<String, Double> studentsAndMarksMap = getStudentsAndMarksMap(studentList);
        studentsAndMarksMap.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("Студенты с оценкой выше 4:");
        studentsAndMarksMap.forEach((k, v) -> {
            if (v > 4) {
                System.out.println(k + ": " + v);
            }
        });

        System.out.println("Список студентов со средним баллом выше 4: ");
        //Создать список студентов, состаящий из ФИО и среднего балла оценок
        List<StudentShort> studentWithMore4Mark = getStudentWithMore4Mark(studentList);
        studentWithMore4Mark.forEach(System.out::println);

        //Посмотреть весь список и распечатать на экран "Есть хорошисты" или "Нет хорошистов"
        boolean isAnyMatch = studentList
                .stream()
                .anyMatch(student -> calculateAverageMark(student.getListOfMarks()) >= 4);

        if (isAnyMatch) {
            System.out.println("Есть хорошисты!");
        } else {
            System.out.println("Нет хорошистов!");
        }

        studentList
                .stream()
                .filter(student -> calculateAverageMark(student.getListOfMarks()) >= 4)
                .findAny()
                .ifPresent(student -> System.out.println("Есть хорошисты!"));


    }

    private List<StudentShort> getStudentWithMore4Mark(List<Student> studentList) {
        return studentList
                .stream()
                .filter(student -> calculateAverageMark(student.getListOfMarks()) > 4)
                .map(student -> new StudentShort(getFio(student),
                        calculateAverageMark(student.getListOfMarks())))
                .collect(Collectors.toList());
    }

    private double calculateAverageMark(List<Integer> listOfMarks) {
        double countOfMarks = listOfMarks.size();
        double sumOfMarks = 0;
        for(Integer mark: listOfMarks) {
            sumOfMarks += mark;
        }
        return sumOfMarks / countOfMarks;
    }

    private Map<String,Double> getStudentsAndMarksMap(List<Student> studentList) {
        Map<String, Double> studentsAndMarksMap = new HashMap<>();
        for (Student student: studentList) {
            Double sumOfMark = 0.0;
            int countOfMarks = student.getListOfMarks().size();
            for(Integer mark: student.getListOfMarks()) {
                sumOfMark += mark;
            }
            double averageMark = sumOfMark / countOfMarks;
            studentsAndMarksMap.put(new GetFioFunction().apply(student), averageMark);
        }
        return studentsAndMarksMap;
    }

    private String getFio(Student student) {
        return student.getName() + " " + student.getSurname() + " " + student.getPatronymic();
    }


    private List<Student> filterStudents(List<Student> studentList) {
        return studentList
                .stream()
                .filter(student -> student.getYearOfBirth() >= 1999
                        && !student.getMobilePhone().isEmpty())
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    private List<Student> getStudentList(int countOfStudent) {
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < countOfStudent; i++) {
            Student student = new Student();
            student.setName("Name" + i);
            student.setSurname("Surname" + i);
            student.setPatronymic("Patronymic" + i);
            student.setYearOfBirth(ThreadLocalRandom.current().nextInt(1970, 2010+1));
            student.setNationality(generateNationality(i));
            student.setNativeLanguage("NativeLanguage" + i);
            student.setMobilePhone(generateMobilePhone(i));
            student.setListOfMarks(generateGradeList());
            students.add(student);
        }
        return students;
    }

    private List<Integer> generateGradeList() {
        List<Integer> gradeList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            gradeList.add(ThreadLocalRandom.current().nextInt(2, 5 + 1));
        }
        return gradeList;
    }

    private String generateMobilePhone(int i) {
        if(i < 7) {
            return String.valueOf(ThreadLocalRandom.current().nextLong(890000000, 899999999 + 1));
        } else {
            return "";
        }
    }

    private String generateNationality(int i) {
        if(i < 2) {
            return "Россия";
        } else if(i < 6) {
            return "Греция";
        } else {
            return "Чехия";
        }
    }

    private void printFullNameAverage(List<Student> studentList) {
        for(Student student : studentList) {
            System.out.println(student.getName() + " " + student.getSurname() + " " + student.getPatronymic() + ": "
                    + student.getAverageOfMarks(student.getListOfMarks()));
        }
    }

    private void printAverageAboveFour(List<Student> studentList) {
        List<Student> students = new ArrayList<>();
        for(Student student : studentList) {
            if(student.getAverageOfMarks(student.getListOfMarks()) > 4) {
                students.add(student);
            }
        }
        printFullNameAverage(students);
    }
}
