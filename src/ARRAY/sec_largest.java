package ARRAY;

import java.util.Arrays;

public class sec_largest {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 6};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            if (i == 1) {
                break;

            }
        }
        System.out.println("ascending order array is :" + Arrays.toString(a));
        System.out.println("second largest element is :" + a[1]);

    }
}

