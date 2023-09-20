import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to MadLib!");
        System.out.println("================================");
        System.out.println("Enter an adjective:");
        String adjective = sc.nextLine();
        System.out.println("Enter a verb: ");
        String verb = sc.nextLine();
        System.out.println("Enter a noun: ");
        String noun = sc.nextLine();
        System.out.println("================================");
        System.out.println("Here is your MadLib");
        System.out.println("My " + adjective + " sister accidentally " + verb + "ed" + " on her " + noun + "!");
    }
}
