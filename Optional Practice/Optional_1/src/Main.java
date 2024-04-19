import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = sc.nextInt();
        System.out.println("The first 4 squared numbers are: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(i * i);
            if (i < number){
                System.out.print(", ");
            }
        }
    }
}
