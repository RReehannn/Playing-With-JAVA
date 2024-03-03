import java.util.Scanner;

class BitwiseComplement {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Showcase of Not/Compliment Operator\n");
        System.out.println("Please Enter your Number:-");
        int Num = input.nextInt();

        int Result = ~Num;
        System.out.println(Result);
    }
}
