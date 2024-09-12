package ss3;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int[][] arrNums =  { { 3, 2, 1, 7 },
                            { 9, 11, 5, 4 },
                            { 6, 0, 13, 17 },
                            { 7, 21, 14, 15 } };
        int max = arrNums[0][0];
        int a = 0,b =0;
        for (int i = 0; i < arrNums.length; i++) {
            for (int j = 0; j < arrNums[i].length; j++) {
                if (arrNums[i][j] > max) {
                    max = arrNums[i][j];
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhât là ["+a+","+b+"]="+max);

    }
}
