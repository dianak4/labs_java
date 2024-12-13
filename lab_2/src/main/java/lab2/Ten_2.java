package lab2;

import java.util.Arrays;

public class Ten_2 {
    public static int[] generateBArray(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            b[i] = count;
        }
        return b;
    }
}
