import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Armstrong Number");
        System.out.println("Please Enter your Number:-");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your Number is Armstrong");
        } else {
                System.out.println("your number is not Armstrong");
            }
        }

    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int finalNumber = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            num /= 10;
            finalNumber += pow(lastdigit, noOfDigits);
        }
        return finalNumber == num;
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }
    public static int noOfDigits(int num){
        int digits = 0;
        while ( num >0){
            digits++;
            num /=10;
        }

        return digits;
    }
}
