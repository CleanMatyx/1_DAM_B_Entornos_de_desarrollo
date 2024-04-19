import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double average = 0;
        getResult(sc, average);
        //Result result = getResult(sc, average);
        //average(result.marks());
        //greatersMarks(result.marks(), result.names(), result.average() / result.n());
    }

    public static void getResult(Scanner sc, double average) {
        int n = getN(sc);

        String[] namesAndMarksArray = getStrings(sc);
        double[] marks = new double[n];
        String[] names = new String[n];

        for(int i = 0; i < n * 2; i++){
            if(i % 2 != 0){
                marks[i / 2] = Double.parseDouble(namesAndMarksArray[i]);
            }else{
                names[i / 2] = namesAndMarksArray[i];
            }
            if(i % 2 != 0){
                average += marks[i / 2];
            }
        }
        double averageFinal = average(marks);
        greatersMarks(marks, names, averageFinal);
        //Result result = new Result(average, n, marks, names);
        //return result;
    }

    public record Result(double average, int n, double[] marks, String[] names) {
    }

    public static String[] getStrings(Scanner sc) {
        System.out.println("Type the names and marks of the students: ");
        String namesAndMarks = sc.nextLine();

        String[] namesAndMarksArray = namesAndMarks.split("\\s+");
        return namesAndMarksArray;
    }

    public static int getN(Scanner sc) {
        int n = 0;
        boolean error;
        do{
            try{
                System.out.println("How many marks and names are you going to " +
                        "introduce? ");
                n = sc.nextInt();
                sc.nextLine(); // consume the newline
                error = false;
            }catch(InputMismatchException e){
                System.out.println("You have to type a number");
                error = true;
                sc.nextLine();
            }
        }while (error);
        return n;
    }

    public static double average(double[] marks){
        double average = 0;
        for(int i = 0; i < marks.length; i++){
            average += marks[i];
        }
        average = average/marks.length;
        System.out.println("The average is: " + average);
        return average;
    }

    public static void greatersMarks(double[] marks, String[] names, double average){
        System.out.println("The students with marks greater than the average are: ");
        for(int i = 0; i < marks.length; i++){
            if(marks[i] > average){
                System.out.println("-  " + names[i]);
            }
        }
    }



}