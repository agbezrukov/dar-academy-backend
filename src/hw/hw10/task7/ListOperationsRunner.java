package hw.hw10.task7;

import java.util.ArrayList;
import java.util.List;

public class ListOperationsRunner {
    public static void main(String[] args) {

        List<String> stringList1 = new ArrayList<>();
        ListOperations<String> strListOperations = new ListOperations<>(stringList1);

        strListOperations.addElement("Car");
        strListOperations.addElement("Cat");
        strListOperations.addElement("Dog");

        strListOperations.printLists();
        strListOperations.replaceElement(1, "Tree");
        strListOperations.printLists();

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("Car");
        stringList2.add("Cat");
        stringList2.add("Dog");

        stringList2.forEach(System.out::println);

        System.out.println(strListOperations.compareLists(stringList2));
    }
}
