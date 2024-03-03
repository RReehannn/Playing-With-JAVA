import java.util.Scanner;

class Fahrenheit_celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Conversion to Temperature converter");

        System.out.println("Enter Tem. in F:");
        float Fah = input.nextFloat();

       // System.out.println("Enter Tem. in C:-");
        //float cel= input.nextFloat();

        float cel = (Fah-32) * 5/9;
        System.out.println(cel + "C");
    }
}
