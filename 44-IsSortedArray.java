class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting check post\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecresing(numArr);
        if(isInc || isDec) {
            System.out.println("your Array is sorted");
        } else {
            System.out.println("your Array is not sorted");
        }

    }

    public static boolean isDecresing(int[] numArr){
        int i = 1;
        while (i < numArr.length){
            if (numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isIncreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length){
            if (numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
