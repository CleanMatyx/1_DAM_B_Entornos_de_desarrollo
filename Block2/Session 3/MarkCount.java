import java.util.Scanner;

public class MarkCount {
    static final int N_MARKS = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = new int[11];
        for (int i = 1; i <= N_MARKS; i++) {
            int mark = -1;
            do {
                System.out.println("Insert mark nº" + i + ":");
                mark = sc.nextInt();
                if (mark < 0 || mark > 10) {
                    System.out.println("Please, insert a mark between 0 and 10.");
                }
            }
            while (mark < 0 || mark > 10);
            counts[mark]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%d: %d marks%n", i, counts[i]);
        }
    }
}
