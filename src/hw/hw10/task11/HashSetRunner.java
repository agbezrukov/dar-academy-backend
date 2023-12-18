package hw.hw10.task11;

import java.util.HashSet;
import java.util.Set;

public class HashSetRunner {
    public static void main(String[] args) {

        Set<Integer> firstIntegersSet = new HashSet<>();
        firstIntegersSet.add(11);
        firstIntegersSet.add(22);
        firstIntegersSet.add(33);
        firstIntegersSet.add(44);
        firstIntegersSet.add(55);

        Set<Integer> secondIntegersSet = new HashSet<>();
        secondIntegersSet.add(11);
        secondIntegersSet.add(22);
        secondIntegersSet.add(3);
        secondIntegersSet.add(44);
        secondIntegersSet.add(5);

        Set<Integer> thirdIntegersSet = new HashSet<>();

        Set<Integer> resultIntegersSet = saveDuplicateElementsFromListsSet(firstIntegersSet, secondIntegersSet);
        System.out.println(resultIntegersSet);

        isSetEmpty(firstIntegersSet);
        isSetEmpty(thirdIntegersSet);
    }

    //Напишите программу для проверки того, является ли HashSet пустым или нет.
    private static void isSetEmpty(Set<Integer> integerSet) {
        if (integerSet.isEmpty()) {
            System.out.println("Список является пустым");
        } else {
            System.out.println("Список не является пустым");
        }
    }

    //Напишите программу для сравнения двух HashSet и сохранения элементов, одинаковых в обоих HashSet.
    private static Set<Integer> saveDuplicateElementsFromListsSet(Set<Integer> firstIntegersSet, Set<Integer> secondIntegersSet) {
        return new HashSet<>(firstIntegersSet) {{
            retainAll(secondIntegersSet);
        }};
    }


}
