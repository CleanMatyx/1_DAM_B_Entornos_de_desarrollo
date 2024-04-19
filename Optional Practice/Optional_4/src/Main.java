import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        double sum = 0;
        int count = 0;
        double min = 0;
        double max = 0;
        while(!end){
            System.out.println("Number? (end to quit)");
            String input = sc.nextLine();
            if(input.equals("end")){
                end = true;
            }else{
                double number = Double.parseDouble(input);
                sum += number;
                count++;
                if(count == 1){
                    min = number;
                    max = number;
                }
                if(number < min){
                    min = number;
                }
                if(number > max){
                    max = number;
                }
                System.out.println("Min: " + min + " Max: " + max + " Sum: "
                        + sum + " Average: " + sum / count);
            }
        }
    }
}