package ss2;

import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        int number ;
        int count = 0 ;
        int num = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng cần hiển thị");
        number = sc.nextInt();
        String str = "";
        while (count < number) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
