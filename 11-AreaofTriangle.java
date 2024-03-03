import java.util.Scanner;

class AreaofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of Triangle");
        System.out.print("Base in m:-");
        int Base = input.nextInt();
        System.out.print("Height in m:-");
        int Height = input.nextInt();

        int Area = (Base*Height)/2;
        System.out.println(Area + " m**m");


    }

}
