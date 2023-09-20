public class FizzBuzz {
    public static void main(String[] args) {
        // Fizz Buzz
          String output = "";
          String num = "";
          for(int i = 1; i <= 100; i++) {
              if(i % 3 == 0 && i % 5 == 0) {
                  output = output + "fizzbuzz";
                  System.out.println(output);
              }else if(i % 3 == 0 && i % 5 != 0) {
                  output = output + "fizz";
                  System.out.println(output);
              } else if(i % 5 == 0 && i % 3 != 0) {
                  output = output + "buzz";
                  System.out.println(output);
              } else {
                  num = Integer.toString(i);
                  System.out.println(num);
              }
              output = "";
          }
    }
}
