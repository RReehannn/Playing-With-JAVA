import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Set your Password\n");
        String password;
        do{
            System.out.println("Please Enter your Password: ");
            password = input.next();
        } while (!isValidPassword(password));
        System.out.println("Thanks for Entering a Valid Password");

    }
    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
