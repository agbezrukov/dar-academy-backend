package hw.hw10.task4;

/*
Напишите класс Student с полем grade типа int.
 */
public class Student {

    private int grade;
    private String name;
    private String surname;

    public Student(int grade, String name, String surname) {
        this.grade = grade;
        this.name = name;
        this.surname = surname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
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

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
