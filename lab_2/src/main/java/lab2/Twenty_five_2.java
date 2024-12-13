package lab2;

public class Twenty_five_2 {

    // Масив для кількості днів до початку місяців (незалежно від високосного року)
    private static final int[] nonLeapYearDays = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    // Функція для визначення номера місяця та дня місяця
    public static String getMonthAndDay(int dayOfYear, boolean isLeapYear) {
        // Якщо рік високосний, додаємо 1 день до кожного місяця, починаючи з березня
        int[] daysInMonth = isLeapYear ?
                new int[] {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335} :
                nonLeapYearDays;

        // Знаходимо місяць і день в місяці
        int month = 0;
        while (month < 12 && dayOfYear > daysInMonth[month]) {
            month++;
        }

        int dayOfMonth = dayOfYear - daysInMonth[month - 1];

        // Повертаємо результат
        return "Місяць: " + month + ", День місяця: " + dayOfMonth;
    }
}
