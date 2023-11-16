package hw.hw7.additional;
/*
Написать метод getDaysInMonth, который принимает два параметра:
month и year (месяц и год) и возвращает количество дней в этом месяце, учитывая високосные годы.
 */
public class Task6 {
    public static void main(String[] args) {

        int month = 6;
        int year = 2008;

        System.out.println(getDaysInMonth(month,year));
    }

    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if ((month < 8 && month % 2 == 1) || (month >= 8 && month % 2 == 0))
            days = 31;
        else if (month == 2)
            days = isLeapYear(year) ? 29 : 28;
        else
            days = 30;
        return days;
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
