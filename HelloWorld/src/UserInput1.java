import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String input = sc.nextLine();
        System.out.printf("You entered %s", input);

// Fizz Buzz
//          String output = "";
//          String num = "";
//          for(int i = 1; i <= 100; i++) {
//              if(i % 3 == 0 && i % 5 == 0) {
//                  output = output + "fizzbuzz";
//                  System.out.println(output);
//              }else if(i % 3 == 0 && i % 5 != 0) {
//                  output = output + "fizz";
//                  System.out.println(output);
//              } else if(i % 5 == 0 && i % 3 != 0) {
//                  output = output + "buzz";
//                  System.out.println(output);
//              } else {
//                  num = Integer.toString(i);
//                  System.out.println(num);
//              }
//              output = "";
//          }
    }
}
