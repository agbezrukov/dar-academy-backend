package hw.hw9.basic.task1;

/*
создайте методы для доступа к имени, id и увеличения года обучения
 */
public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Alexandr", 2020);
        Student student2 = new Student("Aleksey", 2021);
        Student student3 = new Student("Ada", 2022);
        Student student4 = new Student("Andrey", 2020);
        Student student5 = new Student("Dmitriy", 2023);

        System.out.println(student4);
        System.out.println(student3.getName());
        System.out.println(student2.getID());
        System.out.println(student5);
        student5.incrementYear();
        System.out.println(student5);

    }
}
