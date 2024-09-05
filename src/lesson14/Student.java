package lesson14;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private List<Integer> listOfMarks;
    private int yearOfBirth;
    private String nationality;
    private String nativeLanguage;
    private String mobilePhone;

    public Student() {
    }

    public Student(String name, String surname, String patronymic, int yearOfBirth, String nationality, String nativeLanguage, String mobilePhone) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.nationality = nationality;
        this.nativeLanguage = nativeLanguage;
        this.mobilePhone = mobilePhone;
    }

    public Student(String name, String surname, String patronymic, List<Integer> listOfMarks, int yearOfBirth, String nationality, String nativeLanguage, String mobilePhone) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.listOfMarks = listOfMarks;
        this.yearOfBirth = yearOfBirth;
        this.nationality = nationality;
        this.nativeLanguage = nativeLanguage;
        this.mobilePhone = mobilePhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<Integer> getListOfMarks() {
        return listOfMarks;
    }

    public void setListOfMarks(List<Integer> listOfMarks) {
        this.listOfMarks = listOfMarks;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNativeLanguage() {
        return nativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        this.nativeLanguage = nativeLanguage;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public double getAverageOfMarks(List<Integer> gradeList) {
        int summa = 0;
        int countMark = 0;

        for(Integer mark: gradeList) {
            summa += mark;
            countMark++;
        }
        return (double)summa / countMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return yearOfBirth == student.yearOfBirth && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(patronymic, student.patronymic) && Objects.equals(listOfMarks, student.listOfMarks) && Objects.equals(nationality, student.nationality) && Objects.equals(nativeLanguage, student.nativeLanguage) && Objects.equals(mobilePhone, student.mobilePhone);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(surname);
        result = 31 * result + Objects.hashCode(patronymic);
        result = 31 * result + Objects.hashCode(listOfMarks);
        result = 31 * result + yearOfBirth;
        result = 31 * result + Objects.hashCode(nationality);
        result = 31 * result + Objects.hashCode(nativeLanguage);
        result = 31 * result + Objects.hashCode(mobilePhone);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", listOfMarks=" + listOfMarks +
                ", yearOfBirth=" + yearOfBirth +
                ", nationality='" + nationality + '\'' +
                ", nativeLanguage='" + nativeLanguage + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                '}';
    }
}
