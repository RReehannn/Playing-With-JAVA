import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Our Calculator");
        System.out.print("Please Enter first number:-");
        int FirstNum = input.nextInt();
        System.out.print("Please enter second number:-");
        int SecondNum = input.nextInt();
        int Sum = FirstNum+SecondNum;

        System.out.println(Sum);
    }
}
