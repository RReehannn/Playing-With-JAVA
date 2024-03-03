import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Calculator");
        System.out.print("please Enter your First Number:-" );
        int num1 = input.nextInt();
        System.out.print("please Enter your Second Number:-");
        int num2 = input.nextInt();
        System.out.print("now, Enter the operation:-");
        String operation = input.next();

        int result = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;

        };
        System.out.println("your answer is:" + result);
    }
}
