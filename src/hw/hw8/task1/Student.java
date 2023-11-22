package hw.hw8.task1;

/*
Создайте класс с именем 'Student' со строковыми переменными name, surname, address и целочисленной переменной id.
Класс Student имеет метод toString() для печати информации о студенте.
 */
public class Student {

    private String name;
    private String surname;
    private String address;
    private int id;

    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("name: %s, surname: %s, address: %s, id: %s", getName(), getSurname(), getAddress(), getId());
    }
}
