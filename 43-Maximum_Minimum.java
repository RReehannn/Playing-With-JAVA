import java.util.Scanner;

class Maximum_Minimum {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum and Minimum");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("now Enter your Number");
        int max = max(numArr);
        int min = min(numArr);
        System.out.println("max of the Array is " + max);
        System.out.println("min of the Array is " + min);
    }

    public static int min(int[] numArr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArr.length){
            if ( min > numArr[i]) {
                min = numArr[i];
            }
            i++;
        }
        return min;
    }


    public static int max(int[] numArr) {
        if (numArr.length == 0) {
            return Integer.MIN_VALUE;

        }
        int max = numArr[0];
        int i = 1;
        while (i < numArr.length){
            if (max < numArr[i]){
                max = numArr[i];
            }
                i++;
        }
        return max;
    }
}
