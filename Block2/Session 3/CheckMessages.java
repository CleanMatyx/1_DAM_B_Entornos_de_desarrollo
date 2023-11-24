import java.util.Scanner;

public class CheckMessages {
    static final int N_MESSAGES = 2;

    public static void main(String[] args) {

        String[] messages = new String[N_MESSAGES];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < messages.length; i++) {
            System.out.println("Write a line: ");
            messages[i] = sc.nextLine();
        }

        for (int i = 0; i < messages.length; i++) {
            messages[i] = messages[i].replace("Eclipse", "InteliJ");
        }

        for (int i = 0; i < messages.length; i++) {
            System.out.println(messages[i]);
        }
    }
}
