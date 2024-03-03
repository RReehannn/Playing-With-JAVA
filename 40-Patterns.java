import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are here to print pattern");
        System.out.print("please enter the number of rows: ");
        int rows = input.nextInt();
        printFirstPattern(rows);
        printReversePattern(rows);

    }

    public static void printReversePattern(int maxrows){
        int rows = maxrows;
        while (rows > 0) {
           int i = 0;
           while (i < rows) {
               System.out.print(" *");
               i++;
           }

            System.out.println();
            rows--;
        }
    }
    public static void printFirstPattern(int maxrows){
        int rows = 0;
        while (rows < maxrows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
