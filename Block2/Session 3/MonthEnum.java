import java.util.Scanner;

public class MonthEnum {
    enum MonthOfYear {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
        SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }

    ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a month:");
        MonthOfYear month = MonthOfYear.valueOf(sc.next());
        switch (month) {
            case FEBRUARY: {
                System.out.println("28 days");
                break;
            }
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER: {
                System.out.println("31 days");
                break;
            }
            default: {
                System.out.println("30 days");
                break;
            }
        }
    }
}
