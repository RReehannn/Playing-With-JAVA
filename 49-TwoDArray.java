import java.util.Scanner;

class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D Search\n");
        int[][] numArr =ArrayUtility.input2DArray();
        System.out.println("Now Enter the number you want to search");
        int num = input.nextInt();
        boolean isFound = Search(numArr, num);
        if (isFound){
            System.out.println("Your number was found:-");
        }else {
            System.out.println("Your number was not found");
        }

    }
    public static boolean Search(int[][] numARR, int num ){
        int i = 0;
        while (i < numARR.length){
           int j = 0;
           while (j < numARR[i].length){
               if (numARR[i][j] == num){
                   return true;
               }
               j++;
           }
            i++;
        }
        return false;
    }
}
