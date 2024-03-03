import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest");
        System.out.print("Please give principle Amount:-");
        int Principle = input.nextInt();

        System.out.print("give Rate:- ");
        float Rate = input.nextFloat();

        System.out.print("Tell me years:-");

        float years = input.nextFloat();

        float intrest = (Principle*years*Rate)/100;
        System.out.println(intrest + "Rs");
    }
}
