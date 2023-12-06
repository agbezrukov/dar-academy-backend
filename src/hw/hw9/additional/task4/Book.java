package hw.hw9.additional.task4;

/*
Создайте класс Book с приватным полем title и внутренним классом Description.
Внутренний класс должен иметь метод, который выводит описание книги, включая её название, хранящееся в title.
 */
public class Book {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public class Description {

        private String bookDescription;
        private String author;

        public Description(String bookDescription, String author) {
            this.bookDescription = bookDescription;
            this.author = author;
        }

        public void printBook() {
            System.out.println("Book: " + "\n" +
                    "'Title' - " + title + "," + "\n" +
                    "'Author' - " + author + "," + "\n" +
                    "'Description' - " + bookDescription);
        }
    }
}
