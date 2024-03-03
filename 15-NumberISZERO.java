import java.util.Scanner;

class NumberISZERO {
    public static void main(String[] args) {
        System.out.println("Please give your Number:-");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Your number is zero");
}}}
