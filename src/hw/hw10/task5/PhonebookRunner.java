package hw.hw10.task5;

import java.util.Scanner;

public class PhonebookRunner {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("^^ ТЕЛЕФОННАЯ КНИГА котиков ^^" + "\n" +
                    "1. Создать контакт котика, мяу" + "\n" +
                    "2. Найти котика по имени, мяу" + "\n" +
                    "3. Изменить номер котика, мяу" + "\n" +
                    "4. Удалить номер котика, мяу" + "\n" +
                    "5. Показать всех котиков в книге, мяу" + "\n" +
                    "6. Котики устали, мяу");
            try {
                switch (scanner.nextInt()) {
                    case 1 -> phonebook.addContact();
                    case 2 -> phonebook.searchContactByName();
                    case 3 -> phonebook.updateContact();
                    case 4 -> phonebook.deleteContact();
                    case 5 -> phonebook.viewAllContacts();
                    case 6 -> System.exit(0);
                    default -> System.out.println("Неверно ввели число, мяу \n");
                }
            } catch (Exception e) {
                System.out.println("Неверно ввели число, мяу \n");
                scanner.nextLine();
            }
        }
    }
}
