import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find Prime Number");
        System.out.print("please Enter your number:-");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("not prime");
        }

    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }
}


