import java.util.Scanner;

class monthsOfTheYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Month mapping");
        System.out.print("Please Enter your month number:-");
        int monthNum = input.nextInt();
        String monthName = getMonthName(monthNum);
        System.out.println("Your month name is: " + monthName);
    }

    public static String getMonthName(int monthNum) {
        return switch (monthNum) {
            case 1 -> "January";
            case 2 -> "february";
            case 3 -> "march";
            case 4 -> "april";
            case 5 -> "may";
            case 6 -> "June";
            case 7 -> "july";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "october";
            case 11 -> "November";
            case 12 -> "December";
            default -> "mars month";

        };
    }
}