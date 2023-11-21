package hw.hw7.additional;

/*
Написать метод formatTime, который принимает количество секунд и возвращает строку,
представляющую время в формате часов, минут и секунд (HH:mm:ss).
 */
public class Task2 {

    static final int MIN = 60;
    static final int HOUR = MIN * 60;
    static final int SEC = 60;

    public static void main(String[] args) {

        int seconds = 7290;
        String time = formatTime(seconds);
        String time2 = formatTime2(seconds);

        System.out.println(time);
        System.out.println(time2);
    }

    private static String formatTime(int seconds) { // сделал сам
        return (seconds / HOUR) + ":" + ((seconds - HOUR * (seconds / HOUR)) / MIN) + ":" + (seconds % SEC);
    }

    private static String formatTime2(int seconds) { // сделали на уроке
        int minutesSeconds = 60;
        int hourSeconds = 3600;

        int hours = seconds / hourSeconds;
        seconds = seconds % hourSeconds;
        int minutes = seconds / minutesSeconds;
        seconds = seconds % minutesSeconds;

        return (hours < 10 ? "0" : "") + hours + ":" + (minutes < 10 ? "0" : "") + minutes + ":" + (seconds < 10 ? "0" : "") + seconds;
    }
}
