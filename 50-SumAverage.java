class SumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum And Average of 2D Array\n");
        int[][] numsArr = ArrayUtility.input2DArray();
        long sum = sum(numsArr);
        double avg = Average(numsArr);
        System.out.println("your sum of Array is:- " + sum);
        System.out.println("your Average of Array is:- " + avg);

    }
    public static double Average(int[][] numArr){
        if (numArr.length == 0) {
            return 0;
        }
        int rows = numArr.length;
        int colum = numArr[0].length;
        double size = rows * colum;
        return sum(numArr) / size;
    }
    public static long sum(int[][] numArr){
        long sum= 0;
        int i = 0;
        while (i < numArr.length){
            int j =0;
            while (j < numArr[i].length){
            sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
