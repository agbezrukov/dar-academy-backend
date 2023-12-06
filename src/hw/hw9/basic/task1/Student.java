package hw.hw9.basic.task1;

/*
Реализуйте класс Student. Студент имеет имя, id и год обучения.
Предоставьте конструктор с двумя параметрами и создайте методы для доступа к имени, id и увеличения года обучения.
 */
public class Student {
    private String name;
    private int year;
    private static int ID;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
        ID++;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void incrementYear() {
        this.year++;
    }

    @Override
    public String toString() {
        return "ID = " + ID + "; name = " + name + "; year = " + year;
    }
}
