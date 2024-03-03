import java.util.Scanner;

class Bitwise_OR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("showcasing Bitwise or Operator");

        System.out.print("Please Enter First Number:-");
        int First = input.nextInt();

        System.out.print("Please Enter Second Number:-");
        int Second = input.nextInt();

        int Result = First | Second;
        System.out.println("Result is " + Result);
    }
}
