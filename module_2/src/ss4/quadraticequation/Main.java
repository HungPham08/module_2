package ss4.quadraticequation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập vào 3 giá trị cho a, b, c : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        q.display();
        if(q.getDiscriminant()==0){
            System.out.format("Phương trình có nghiệm là: %.4f",q.getRoot1());
        }
        else if(q.getDiscriminant()>0){
            System.out.format("Phương trình có 2 nghiệm là: %.4f và %.4f ",q.getRoot1(),q.getRoot2());

        }
        else{
            System.out.println("The equation has no real root");
        }

    }
}
