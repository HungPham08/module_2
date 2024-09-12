package ss3;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 4, 6, 7, 8};
        int[] arr2 = {17, 4, 6, 5, 8, 8};
        int[] arr3 = new int[(arr1.length+arr2.length)];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i; j < arr1.length; j++) {
                arr3[j] = arr1[i];
            }
            for (int k = i; k < arr2.length; k++) {
                arr3[k+arr1.length] = arr2[i];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
