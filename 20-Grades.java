import java.util.Scanner;

class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in Grade System ");
        System.out.print("Please Enter % of Student:-");
        float Percentage = input.nextFloat();

        if (Percentage >= 90) {
            System.out.println( " Grade A");
        } else if (Percentage >= 75) {
            System.out.println(" Grade B");
        } else if (Percentage >= 60) {
            System.out.println("Grade C");
        } else if (Percentage >= 30) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}

