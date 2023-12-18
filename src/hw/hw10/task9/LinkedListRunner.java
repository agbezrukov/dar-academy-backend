package hw.hw10.task9;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRunner {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(123);
        linkedList.add(13);
        linkedList.add(3);
        linkedList.add(444);
        linkedList.add(543);
        linkedList.add(321);

        //Напишите программу для получения первого и последнего вхождения указанных элементов в связном списке.
        System.out.println(getFirstAndLast(linkedList));

        //Напишите программу для замены двух элементов в связном списке.
        System.out.println(linkedList);
        replaceElements(linkedList, 13, 543);
        System.out.println(linkedList);
    }

    private static Pair<Integer, Integer> getFirstAndLast(List<Integer> list) {
        if (!list.isEmpty()) {
            int firstElement = list.get(0);
            int lastElement = list.get(list.size() - 1);
            return new Pair<>(firstElement, lastElement);
        } else {
            return null;
        }
    }

    private static void replaceElements(List<Integer> list, int firstElement, int secondElement) {
        int firstIndex = list.indexOf(firstElement);
        int newElement = firstElement;
        int secondIndex = list.indexOf(secondElement);
        if (firstIndex != -1 && secondIndex != -1) {
            list.set(firstIndex, secondElement);
            list.set(secondIndex, newElement);
        }
    }
}
