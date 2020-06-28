package QMcourse;

import java.util.Random;

/**
 * @Description: Test01
 * @Author:
 * @Date: 2020-06-15
 * @Version:v1.0
 */
public class Test01 {
    public static void main(String[] args) {
        /*int[] array = new int[10];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        int[] arr1 = new int[] { 1, 2, 3 };
        int[] arr2 = new int[] { 1, 2, 3 };
        int[] arr3 = new int[] { 1, 2, 3, 4 };
        int[] arr4 = null;
        System.out.println(isEqual(arr1, arr1)); // true
        System.out.println(isEqual(arr1, arr2)); // true
        System.out.println(isEqual(arr1, arr3)); // false
        System.out.println(isEqual(arr1, arr4)); // false*/
        /*int[] a = {0, 12, 2, 3};
        int[] output = doSome(a, 3);

        for (int i:output) {
            System.out.print(i + " ");
        }*/
        /*Integer num = new Integer(100);
        int num2 = num.intValue();*/
        try {
            Random random = new Random();
            int a = random.nextInt(13) + 1;
            double b = random.nextDouble() + 4.0;
            System.out.println(a);
            System.out.println(b);
        } finally {
            System.out.println();
        }

    }

    public static boolean isEqual(int[] ar1, int[] ar2){
        if (ar1 == null || ar2 == null) {
            return false;
        }
        if (ar1.length != ar2.length){
            return false;
        }
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] != ar2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] doSome(int[] input, int n){
        int[] output = new int[input.length * n];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < n; j++) {
                output[i * n + j] = input[i];
            }
        }
        return output;
    }

}
