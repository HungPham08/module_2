package ss2;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        int num = 2;
        while (num<100){
            boolean isPrime = true;
            for(int i=2;i<= Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
            }
            num++;
        }
    }
}
