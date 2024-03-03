import java.util.Scanner;

class HighModrateLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Score Checking");
        System.out.print("please Enter Marks:- ");
        int Marks = input.nextInt();

        String category = Marks > 80 ? "High" : (Marks > 50 ? "Moderate" : "low");
        System.out.println(category);
    }
}
