package hw.hw5;

/*
В компании прошла аттестация по компетенциям и навыкам сотрудников. Даны зарплата и класс сотрудника.
Напишите программу, чтобы определить сумму премии в зависимости от класса сотрудника.
Необходимо создать переменную со значением зарплаты сотрудника, вывести в консоль результирующую зарплату с премией.

Бонусы в зависимости от класса:

Класс A: 50%
Класс B: 25%
Класс C: 0%
 */
public class Task8 {
    public static void main(String[] args) {

        String gradeClass = "C";
        double employeeSalary = 4000.0;

        switch (gradeClass) {
            case "A":
                employeeSalary += employeeSalary * 50 / 100;
                System.out.println(employeeSalary);
                break;
            case "B":
                employeeSalary += employeeSalary * 25 / 100;
                System.out.println(employeeSalary);
                break;
            case "C":
                System.out.println(employeeSalary);
                break;
            default:
                System.out.println("class is not correctly");
        }
    }
}
