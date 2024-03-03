import java.util.Scanner;

class Three_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the World of Three\n");

        System.out.print("Please Enter your Number: ");
        int first = input.nextInt();
        System.out.print("Enter your Second Number: ");
        int second = input.nextInt();
        System.out.print("Enter your third Number:-");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + " Greatest number");
        } else if (second >= third) {
            System.out.println(second + " second is greatest number");
        } else {
            System.out.println(third + " Third is Greatest number");
        }

    }
}
