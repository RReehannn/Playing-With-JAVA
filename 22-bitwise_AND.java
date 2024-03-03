import java.util.Scanner;

class bitwise_AND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise and Operator");
        System.out.print("Please Enter the first number:- ");
        int first = input.nextInt();
        System.out.print("Enter the other number:-");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is " + result);
    }
}
