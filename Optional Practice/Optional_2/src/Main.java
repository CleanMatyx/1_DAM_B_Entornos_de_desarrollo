import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;
        do{
             System.out.println("Input a number: ");
             number = sc.nextInt();
             count++;
        }while(number != 0);
        System.out.println("The number of numbers input is: " + (count -1));
    }
}