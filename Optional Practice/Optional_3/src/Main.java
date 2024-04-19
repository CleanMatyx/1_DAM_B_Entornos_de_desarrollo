import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        System.out.println("Prime numbers until " + n + " are: ");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i);
                if (i >=2) {
                    System.out.print(", ");
                }
            }
        }
    }

    public static boolean isPrime(int n){
        boolean prime = true;
        if(n <= 1){
            prime = false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                prime = false;
            }
        }
        return prime;
    }
}
