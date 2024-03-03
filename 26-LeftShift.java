import java.util.Scanner;

class LeftShift {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Showcase LeftShift Operator\n");
        System.out.print("Please Enter your Number:-");
        int Num = input.nextInt();

        int Result = Num << 1;
        System.out.println(Result);
    }
}
