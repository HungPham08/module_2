package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn chèn:");
        int element = sc.nextInt();
        System.out.println("Nhập số vị trí muốn chèn:");
        int index = sc.nextInt();
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Mảng vừa nhập:"+ Arrays.toString(arr));
        if(index>=0 && index<=arr.length){
            int temp = arr[index];
            for (int i = index+1; i < arr.length; i++) {
                int oldElement = temp;
                temp = arr[i];
                arr[i] = oldElement;
            }
            arr[index] = element;

        }
        else {
            System.out.println("nhập lại vị trí chèn");
        }
        System.out.println("Mảng sau khi chèn phần tử "+element+" là\n"+Arrays.toString(arr));

    }
}
