import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in modulus Game");
        System.out.print("please Enter the number: ");
        int num = input.nextInt();
        int Result = num >=0? num : -num;
        System.out.println(Result);



    }
}
