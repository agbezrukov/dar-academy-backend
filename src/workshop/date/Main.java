package workshop.date;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static workshop.date.Month.getDaysInMonth;

public class Main {
    public static void main(String[] args) {
        UtilDate utilDate = new UtilDate();
        int amountWeek = utilDate.getWeeksBetweenDays("2023-07-18", "2023-08-28", "yyyy-MM-dd");
        System.out.println(amountWeek);

        Month myMonth = Month.JANUARY;
        System.out.println(getDaysInMonth(myMonth));

        System.out.println(utilDate.getNextTuesday("2023-12-05"));

    }
}
