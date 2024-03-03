import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Welcome to multiplication World\n");
        System.out.print("Please Enter your Number: ");
        int num = Scanner.nextInt();
        MultiplicationTable(num);
    }

    public static void MultiplicationTable (int num){
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}
