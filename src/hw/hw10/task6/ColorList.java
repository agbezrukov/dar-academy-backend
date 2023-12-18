package hw.hw10.task6;

import java.util.ArrayList;
import java.util.List;

/*
Напишите программу для создания нового списка ArrayList, добавления некоторых цветов (String) и вывода коллекции на печать.
 */
public class ColorList {

    private List<String> colorList = new ArrayList<>();

    public void putColorToList(String color) {
        colorList.add(color);
    }

    public void printColorList() {
        colorList.forEach(System.out::println);
    }

}
