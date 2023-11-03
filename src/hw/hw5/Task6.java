package hw.hw5;

//
public class Task6 {
    public static void main(String[] args) {

        System.out.println("i");
        System.out.println();
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("ii");
        System.out.println();

        String s1 = "";
        for (int i = 0; i < 5; i++) {
            s1 += "*";
            System.out.println(s1);
        }

        System.out.println();
        System.out.println("iii");
        System.out.println();

        String s = ""; // пустая перемнная типа стринг
        int n = 5; // высота пирамиды
        for (int i = 1; i <= n; i++) {  // наша пирамида всегда начинается с 1
            if (i == 1) {  // (если i = 1) то это условие
//                s = s + i; // i у нас интовое число, можно просто прибавить к стрингу
                s = String.valueOf(i); // можно через valueOf перевести в стринг и добавить к строке
            } else { // в остальных случаях выбираем этот параметр
                s = i + s + i; // где к i добавляем с двух сторон строки
            }
            for (int j = n - i; j > 0; j--) { // данное условие добавляеи пробелы где мы j = n - i постоянно отнимаем уменьшая кол-во пробелов
                System.out.print(" "); // пробелы распечатанные в строку
            }
            System.out.println(s); // распечатываем s  где мы выше добавили данные в строку
        }
    }
}
