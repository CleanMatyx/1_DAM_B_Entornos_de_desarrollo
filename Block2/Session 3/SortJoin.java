import java.util.Arrays;
import java.util.Scanner;

public class SortJoin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of names separated by whitespaces:");
        String names = sc.nextLine();

        String[] list = names.split(" ");
        Arrays.sort(list);

        String result = String.join(", ", list);
        System.out.println(result);
    }
}
