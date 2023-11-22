package hw.hw8.task1;

/*
Создайте объект класса Student, присвойте значения name - "Алиса", surname - "Смит", address - "Коктем-2", id - 24.
Создайте еще два объекта класса Student.
Присвойте регистрационный номер, фамилию, имя и адрес двух студентов с именами "Азамат" и "Кристина" соответственно.
Выведите информацию о студентах с помощью метода toString().
 */
public class StudentRunner {
    public static void main(String[] args) {

        Student student1 = new Student("Алиса", "Смит", "Коктем-2", 24);
        Student student2 = new Student("Азамат", "Алимжанов", "Достык 42", 34);
        Student student3 = new Student("Кристина", "Заворотнюк", "Абая 15", 41);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
