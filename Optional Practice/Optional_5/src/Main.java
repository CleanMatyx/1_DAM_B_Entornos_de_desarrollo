import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double average = 0;
        double bestMark = 0;
        double mark = 0;
        System.out.println("How many marks are you going to introduce?");
        int n = sc.nextInt();
        double[] marks = new double[n];
        for(int i = 0; i < n; i++){
            marks[i] = sc.nextDouble();
            if (marks[i] > bestMark){
                bestMark = marks[i];
            }
            average += marks[i];
        }
        System.out.println("The average is: " + average/n
                + "the marks greater than the average are: " + bestMark);
    }
}
