import java.util.Scanner;

class Flotmultipication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing float Multiplication");
        System.out.print("Enter first Decimal Number: ");
        double first = input.nextDouble();
        System.out.print("now, Enter second number:");
        double second = input.nextDouble();

        double mul = first*second;
        System.out.println(mul);
    }
}
