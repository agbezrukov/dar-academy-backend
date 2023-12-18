package hw.hw10.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Затем создайте несколько экземпляров вашего класса и добавьте их в коллекцию.
Затем выполните итерацию по вашему набору (используя foreach или iterator) и покажите, что будет получено в результате.
 */
public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student(17, "Vladimir", "Borisov");
        Student student2 = new Student(55, "Svetlana", "Olegovna");
        Student student3 = new Student(100, "Alexandr", "Bezrukov");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

//        for (Student st : studentList) {
//            System.out.println(st);
//        }

        studentList.forEach(System.out::println);

//        Iterator<Student> studentIterator = studentList.iterator();
//        while (studentIterator.hasNext()) {
//            Student student = studentIterator.next();
//            System.out.println(student.toString());
//        }

    }
}
