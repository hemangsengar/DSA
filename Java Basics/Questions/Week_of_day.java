import java.util.Scanner;

public class Week_of_day {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the day of week");
        int Day_of_week = Input.nextInt();

        Input.close();

        switch (Day_of_week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                
            
            default:
                System.out.println("Wrong Day input");
        }
    }
}
