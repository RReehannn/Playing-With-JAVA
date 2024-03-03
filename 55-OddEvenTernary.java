import java.util.Scanner;

class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd And Even testing");
        System.out.print("please Enter the number:-");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even" : "odd";
        System.out.println("Your number is " + result);

    }
}

   // public int OddEven(int num){
//        if (num%1){
//            System.out.println("This is odd number ");
//        } else {
//            System.out.println("This is even number ");
//        }
//        return num;
//    }
//}
