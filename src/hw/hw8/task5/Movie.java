package hw.hw8.task5;

/*
Создайте класс 'Movie'. Экземпляр класса Movie представляет фильм. Этот класс имеет следующие три переменные класса:
 title, которая является строкой, представляющей название фильма
 studio, которая является строкой, представляющей студию, снявшую фильм
 rating, которая представляет собой строку, обозначающую рейтинг фильма (например, PG13, R, G, PG, NC-17 и т.д.).
     1) Напишите конструктор для класса Movie, который принимает в качестве аргументов строку,
     представляющую название фильма, строку, представляющую студию, и строку, представляющую рейтинг,
     и устанавливает соответствующие переменные класса в эти значения.
     2) Напишите второй конструктор для класса Movie, который принимает в качестве аргументов строку,
     представляющую название фильма, и строку, представляющую студию,
     и устанавливает соответствующие переменные класса в эти значения, а переменную класса rating устанавливает в значение "PG".
 */
public class Movie {

    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
}
