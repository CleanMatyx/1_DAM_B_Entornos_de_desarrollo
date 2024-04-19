import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = askNumbers(sc, numbers);
        int[] even = numberList(numbers, count, 1);
        int[] odd = numberList(numbers, count, 2);
        showList(even, 1);
        System.out.println();
        showList(odd, 2);

    }

    public static int askNumbers(Scanner sc, int[] numbers) {

        int count = 0;
        System.out.println("introduce 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            int number = sc.nextInt();
            numbers[i] = number;
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] numberList(int[] numbers, int count, int option) {
        int list = count;
        if (option == 2) {
            list = numbers.length - count;
        }
        int[] numberList = new int[list];
        int j = 0;

        for(int i = 0; i < numbers.length; i++){
            if ((numbers[i] % 2 == 0 && option == 1) || (numbers[i] % 2 != 0 && option == 2)) {
                numberList[j] = numbers[i];
                j++;
            }
        }
        return numberList;
    }

    public static void showList(int[] list, int option) {

        if (option == 1) {
            System.out.print("Even numbers: ");
        } else {
            System.out.print("Odd numbers: ");
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
                System.out.print(list[i]);
                if (i < list.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}