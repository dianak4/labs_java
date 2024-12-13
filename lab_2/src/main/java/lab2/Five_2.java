package lab2;

public class Five_2 {

    public static String checkArray(int[] a) {
        if (a.length == 0) {
            return "Масив порожній.";
        }

        boolean allPositive = true;
        boolean allNegative = true;

        for (int num : a) {
            if (num > 0) {
                allNegative = false;
            } else if (num < 0) {
                allPositive = false;
            }

            if (!allPositive && !allNegative) {
                return "Масив містить як позитивні, так і негативні числа.";
            }
        }

        if (allPositive) {
            return "Всі елементи масиву є позитивними.";
        } else if (allNegative) {
            return "Всі елементи масиву є негативними.";
        }

        return "";
    }
}
