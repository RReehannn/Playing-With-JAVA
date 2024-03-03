import java.util.Scanner;

class MultiplicationTableForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welecome to printing Table");
        System.out.print("please Enter the number:-");
          int num = input.nextInt();

        for ( int i = 1; i <= 10; i++) {
            System.out.println( num + " X " + i + " = " + num*i );


        }
    }
}
