import java.util.Scanner;

class numberOfOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array occurrences\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("now Enter the number you want to find");
        int num = input.nextInt();
        int occurrences = noOfoccurrences(numArr, num);
        System.out.println("your element was found " + occurrences + " times in the array");
    }

    public static int noOfoccurrences(int[] numArr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;


        }
        i++;
    }
     return occ;
    }
}
