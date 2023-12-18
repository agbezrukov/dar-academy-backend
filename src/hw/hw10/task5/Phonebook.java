package hw.hw10.task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Напишите консольное приложение, представляющее простую телефонную книгу,
содержащую связки между именами и телефонными номерами.
Подумайте тщательно, какую структуру данных можно использовать для этого типа приложения.
В главном меню пользователь имеет возможность добавить новый контакт, просмотреть все контакты,
обновить информацию о конкретном контакте и выполнить поиск контактов по имени.
Подсказка: используйте Scanner, while(true), switch-case.
 */
public class Phonebook {
    private static Map<String, String> phoneBook = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.println("Введите имя котика, мяу");
        String name = scanner.next();
        System.out.println("Введите номер телефона, мяу");
        String mobileNumber = scanner.next();
        phoneBook.put(name, mobileNumber);
        System.out.println("Контакт котика создан, мяу \n");
    }

    public void searchContactByName() {
        System.out.println("Введите имя котика, мяу");
        String name = scanner.next();

        if (phoneBook.containsKey(name)) {
            System.out.println("Имя котика: " + name + ", Номер котика: " + phoneBook.get(name) + ", мяу \n");
        } else {
            System.out.println("Контакт котика не найден, мяу \n");
        }
    }

    public void deleteContact() {
        System.out.println("Введите имя котика для удаления, мяу");
        String name = scanner.next();

        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            System.out.println("Котик: " + name + " удален, мяу \n");
        } else {
            System.out.println("Контакт котика для удаления не найден, мяу \n");
        }
    }

    public void viewAllContacts() {
        if (phoneBook.isEmpty()) {
            System.out.println("В книге котиков пока нет, мяу \n");
        } else {
            phoneBook.forEach((key, value) -> System.out.println("Имя котика: " + key + ", Номер котика: " + value + ", мяу"));
            System.out.println();
        }
    }

    public void updateContact() {
        System.out.println("Введите имя котика, мяу");
        String name = scanner.next();

        if (phoneBook.containsKey(name)) {
            System.out.println("Введите новый номер котика, мяу");
            String newMobileNumber = scanner.next();
            phoneBook.put(name, newMobileNumber);
            System.out.println("Контакт котика изменен, мяу \n");
        } else {
            System.out.println("Контакт котика не найден, мяу \n");
        }
    }
}
