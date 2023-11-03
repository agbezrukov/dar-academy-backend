package hw.hw5;

/*
В университете существуют следующие правила для системы оценок:
Ниже 25 - F
От 25 до 45 - E
От 45 до 50 - D
От 50 до 60 - C
От 60 до 80 - B
Выше 80 - A
Создайте переменную grade и напечатайте в консоль соответствующую оценку в зависимости от значения переменной.
 */
public class Task3 {
    public static void main(String[] args) {

        int grade = 100;

        if (grade >= 0 && grade < 25) {
            System.out.println("Your grade = F");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("Your grade = E");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("Your grade = D");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("Your grade = C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("Your grade = B");
        } else if (grade >= 80 && grade <= 100) {
            System.out.println("Your grade = A");
        } else {
            System.out.println("grade is incorrect");
        }
    }
}
