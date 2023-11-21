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

        int points = 20;
        char grade;


        if (points < 25) {
            grade = 'F';
        } else if (points >= 25 && points < 45) {
            grade = 'E';
        } else if (points >= 45 && points < 50) {
            grade = 'D';
        } else if (points >= 50 && points < 60) {
            grade = 'C';
        } else if (points >= 60 && points < 80) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your points = " + grade);
    }
}
