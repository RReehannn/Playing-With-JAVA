import java.util.Scanner;

class OccurrencesSpecificElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding occurrences");
        int[] nums = ArrayUtility.inputArray();
        System.out.println("Now, Enter the number you want to search");
        int element = input.nextInt();
        int occ = countOccurrences(nums, element);
        System.out.println("Your Element was found: " + occ+ "times");
    }

    public static int countOccurrences(int[] nums, int element){
        int occ = 0;
        for (int num : nums){
            if (num == element){
                occ++;
            }
        }
        return occ;
    }
}
