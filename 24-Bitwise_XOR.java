import java.util.Scanner;

class Bitwise_XOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("showcasing Bitwise Xor Operator");
        System.out.println("Please Enter First Number:-");
        int First = input.nextInt();
        System.out.println("Please Enter Second Number:-");
        int Second = input.nextInt();

        int Result = First ^ Second;
        System.out.println("Result is " + Result);
    }
}
