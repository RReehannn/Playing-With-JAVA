import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Palindrome the Digits");
        System.out.print("please Enter the Digits:-");
        int  num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome){
            System.out.println("Your Number is a palindrome number");
        } else {
            System.out.println("your Number is not palindrome number");
        }
    }

    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
