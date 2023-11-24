import java.util.Scanner;

public class LispChecker {
    public static void main(String[] args) {
        //String text = "(let ((new (x-point a y))))";
        System.out.println("Enter a instruction with parenthesis:");
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int parent1 = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                parent1++;
            } else if (text.charAt(i) == ')') {
                parent1--;
            }
        }
        if (parent1 == 0) {
            System.out.println("The parenthesis are correct.");
        } else {
            System.out.println("The parenthesis are incorrect.");
        }
    }
}
