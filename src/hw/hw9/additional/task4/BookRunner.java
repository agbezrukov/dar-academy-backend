package hw.hw9.additional.task4;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book("1984");
        Book.Description bookDes = book.new Description("роман-антиутопия", "Джордж Оруэлл");

        bookDes.printBook();
    }
}
