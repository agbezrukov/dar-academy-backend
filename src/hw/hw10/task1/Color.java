package hw.hw10.task1;

/*
Создайте публичное перечисление Colors с константами цветов. Выведите значения перечисления Colors на печать.
 */
public class Color {

    Colors color;

    public Color() {
    }

    public Color(Colors color) {
        this.color = color;
    }

    public void allColors() {
        for (Colors c : Colors.values()) {
            System.out.println(c);
        }
    }
}
