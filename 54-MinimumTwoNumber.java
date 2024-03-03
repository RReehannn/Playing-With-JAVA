import java.util.Scanner;

class MinimumTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find miniumum two Number");
        System.out.print("please Enter first number:- ");
        int num1 = input.nextInt();
        System.out.print("please Enter Second number:- ");
        int num2 = input.nextInt();
        MinimumTwoNumber ternary = new MinimumTwoNumber();
        int min = ternary.min(num1, num2);
        System.out.println("minimum number is: " + min);

//    int minimumNumber = num1 < num2 ? num1 : num2;
//        System.out.println(minimumNumber + " is the minimum number");
    }
    public int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
//        if (num1 < num2){
//            return num1;
//
//    } else {
//            return num2;
//        }

    }

}
