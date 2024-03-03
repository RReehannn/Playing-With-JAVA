import java.util.Scanner;

class arthemitic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Calculator\n");
        System.out.print("please enter first number:-");
        int first = input.nextInt();
        System.out.print("now, enter second nuber:-");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first* second;
        int div = first/ second;


        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}
