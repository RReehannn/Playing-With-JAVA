import java.util.Scanner;

class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Enter your command: ");
            String command = input.next();
            if (command.equals("Exit")) {
                break;
            }
        }
        System.out.println("You have successfully exited.");
    }
}
