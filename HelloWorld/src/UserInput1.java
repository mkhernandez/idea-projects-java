import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = sc.nextLine();
        System.out.printf("You entered %s", input);
    }
}
