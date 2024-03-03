import java.util.Scanner;

class CompoundIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculation of CompoundInterest");

        System.out.print("Give principle Amount:-");
        int Principle = input.nextInt();

        System.out.println(" give Rate in %");
        float Rate = input.nextFloat();

        System.out.println("time");
        float time = input.nextFloat();

        double Result = Principle* Math.pow((1+ Rate/ 100), time);

        System.out.println(Result);

    }
}
