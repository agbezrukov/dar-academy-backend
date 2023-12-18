package hw.hw10.task7;

import java.util.ArrayList;
import java.util.List;

public class ListOperations<T> {

    private List<T> innerList;

    public ListOperations(List<T> innerList) {
        this.innerList = innerList;
    }

    public void addElement(T element) {
        innerList.add(element);
    }

    // 8. Напишите программу для замены второго элемента списка ArrayList на указанный элемент.
    public void replaceElement(int index, T newElement) {
        if (index >= 0 && index < innerList.size()) {
            innerList.set(index, newElement);
        } else {
            System.out.println("Индекс выходит за пределы списка");
        }
    }

    public void printLists() {
        innerList.forEach(System.out::println);
    }

    public boolean compareLists(List<T> outterList) {
        if (innerList.size() != outterList.size() && innerList.isEmpty()) {
            return false;
        }

        for (int i = 0; i < innerList.size(); i++) {
            if (!innerList.get(i).equals(outterList.get(i))) {
                return false;
            }
        }

        return true;
    }
}
