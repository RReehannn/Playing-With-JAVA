import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leap Year Calculation");
        System.out.print("Please Enter Year:-");
        int year = input.nextInt();

        if (year % 400 ==0) {
            System.out.println("This is a leap Year");
        } else if (year % 100 ==0) {
            System.out.println("This is not a leap year");
        } else if (year % 4 ==0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }
}
