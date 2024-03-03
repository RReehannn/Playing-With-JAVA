import java.util.Scanner;

class Odd_EvenBitWise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Number:-");
        int Num = input.nextInt();

        if ((Num & 1) ==1 ){
            System.out.println("Your Number is odd");
        } else {
            System.out.println("your number is Even");
        }
    }
}
