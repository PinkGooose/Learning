package lesson14;

import java.util.Objects;

public class StudentShort {
    private String fio;
    private Double averageMark;

    public StudentShort() {
    }

    public StudentShort(String fio, Double averageMark) {
        this.fio = fio;
        this.averageMark = averageMark;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentShort that = (StudentShort) o;
        return Objects.equals(fio, that.fio) && Objects.equals(averageMark, that.averageMark);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(fio);
        result = 31 * result + Objects.hashCode(averageMark);
        return result;
    }

    @Override
    public String toString() {
        return "StudentShort{" +
                "fio='" + fio + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
