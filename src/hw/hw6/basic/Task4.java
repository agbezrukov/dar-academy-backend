package hw.hw6.basic;
/*
4. Дан массив целых значений. Напишите программу для нахождения индекса элемента массива.

1)
Дано:
[1, 3, -6, 23, 14, 2]
int x = 23
Вывод:
Индекс = 3

2)
Дано:
[1, 3, -6, 23, 14, 2]
int x = 5
Вывод:

Не найдено
 */
public class Task4 {
    public static void main(String[] args) {

        int [] array = {1, 3, -6, 23, 14, 2};
        int x = 2;
        boolean isCheck = false;
        int indexNum = 0;

        for (int i = 0; i < array.length; i++) {
            if(x == array[i]){
                isCheck = true;
                indexNum = i;
            }
        }

        if (isCheck){
                System.out.println("Вывод:");
                System.out.println("Индекс = " + indexNum);
        } else {
            System.out.println("Вывод:");
            System.out.println("Не найдено");
        }
    }
}
