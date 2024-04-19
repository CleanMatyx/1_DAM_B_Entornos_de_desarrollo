
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a month: ");
        String month = sc.nextLine();

        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
                "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int count = 0;
        while (count < months.length && !months[count].equals(month.toUpperCase())) {
            count++;
        }
        System.out.println("The month " + month + " has " + days[count] + " days.");
    }
}



