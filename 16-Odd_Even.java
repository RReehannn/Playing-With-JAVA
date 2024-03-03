import java.util.Scanner;

class Odd_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Number:-");
        int num = input.nextInt();

        if ( num % 2 == 0) {
            System.out.println("This is Even Number");
        } else {
            System.out.println("This is odd");

        }
    }
}
