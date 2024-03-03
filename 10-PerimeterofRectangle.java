import java.util.Scanner;

class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("perimeter of Rectangle");
        System.out.println("please Enter All four sidein m: ");
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double D = input.nextDouble();

        double perimeter = A+B+C+D;

        System.out.println(perimeter + "m");

    }
}
