package ss1;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        currency();
    }
    public static void currency() {
        System.out.println("Nhập số tiền theo USD");
        Scanner sc = new Scanner(System.in);
        double usd = Double.parseDouble(sc.nextLine());
        double vnd = usd* 23500;
        System.out.println(usd + "$ = " + vnd+"VND");
    }
}
