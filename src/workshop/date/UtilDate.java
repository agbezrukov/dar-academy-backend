package workshop.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.NavigableMap;

public class UtilDate {
    /*
Создать функцию, которая принимает две даты в виде строк и формат, в котором эти даты представлены,
и возвращает количество полных недель между этими датами.
 */
    public int getWeeksBetweenDays(String dateFirst, String dateSecond, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate startDate = LocalDate.parse(dateFirst, formatter);
        LocalDate endDate = LocalDate.parse(dateSecond, formatter);
        return (int) ChronoUnit.DAYS.between(startDate, endDate) / 7;
    }

    /*
   Написать функцию, которая возвращает дату следующего вторника относительно заданной даты.
   */
//    public Date getNextTuesday(String strDate) {
//        Date date = parseDate(strDate);
//
//        Calendar c = Calendar.getInstance();
//        c.setTime(date);
//
//        int currentDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//        int days = (Calendar.TUESDAY - currentDayOfWeek + 7) % 7;
//
//        c.add(Calendar.DATE, days);
//        return c.getTime();
//    }

    public Date getNextTuesday(String strDate) {

        Date date = parseDate(strDate);
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        int currentDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        int days = ((Calendar.TUESDAY - currentDayOfWeek + 7) % 7 == 0) ? 7 : (Calendar.TUESDAY - currentDayOfWeek + 7) % 7;

        c.add(Calendar.DATE, days);
        return c.getTime();
    }

    //        int days = 0;

//        if (currentDayOfWeek >= 3)
//            days = 7 - (currentDayOfWeek - 3);
//        if (currentDayOfWeek < 3)
//            days = 3 - currentDayOfWeek;

    //    public LocalDate getNextTuesday(String strDate) {
//        LocalDate localDate = LocalDate.parse(strDate);
//        DayOfWeek currentDayOfWeek = localDate.getDayOfWeek();
//
//        int daysUntilNextTuesday = DayOfWeek.TUESDAY.getValue() - currentDayOfWeek.getValue() +
//                ((DayOfWeek.TUESDAY.getValue() - currentDayOfWeek.getValue() <= 0) ? 7 : 0);
//
//        return localDate.plusDays(daysUntilNextTuesday);
//}
//    private Date parseDate(String strDate) {
//        try {
//            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//            return df.parse(strDate);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return new Date();
//    }
    private Date parseDate(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}