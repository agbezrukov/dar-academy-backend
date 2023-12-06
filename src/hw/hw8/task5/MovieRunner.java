package hw.hw8.task5;

/*
     3) Создайте экземпляры класса Movie
     с названием "Фокус", студией "RatPac-Dune Entertainment" и рейтингом "R" и
     с названием "Главный герой" и студией "20th Century Studios"
 */
public class MovieRunner {
    public static void main(String[] args) {

        Movie film1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie film2 = new Movie("Главный герой", "20th Century Studios");

        System.out.println(film2);

        Movie film3;

        try {
            film3 = (Movie) film1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        film3.setRating("S");
        System.out.println(film1);
        System.out.println(film3);

    }
}
