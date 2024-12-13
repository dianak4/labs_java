package lab2;

import java.util.Arrays;

public class Twenty_2 {

    // Метод для обчислення відсотків елементів менших, рівних та більших за середнє значення
    public static double[] calculateStatistics(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім");
        }

        double sum = 0;
        for (int num : a) {
            sum += num;
        }

        double average = sum / a.length;
        int lessThanAverage = 0;
        int equalToAverage = 0;
        int greaterThanAverage = 0;

        for (int num : a) {
            if (num < average) {
                lessThanAverage++;
            } else if (num == average) {
                equalToAverage++;
            } else {
                greaterThanAverage++;
            }
        }

        double totalElements = a.length;
        double[] result = new double[3];
        result[0] = (lessThanAverage / totalElements) * 100; // відсоток менших за середнє
        result[1] = (equalToAverage / totalElements) * 100; // відсоток рівних середньому
        result[2] = (greaterThanAverage / totalElements) * 100; // відсоток більших за середнє

        return result;
    }
}