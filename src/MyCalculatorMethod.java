// WB 3 : My calculator
import java.util.Scanner;
public class MyCalculatorMethod {
    public static void main(String[] args) { // main method
    // 1. read in two user inputs num1, num2, print them
    Scanner number = new Scanner(System.in);
        System.out.println("Enter two numbers : ");

        int number1 = number.nextInt();
        int number2 = number.nextInt();

        // 3. call the methods to compute
        System.out.println(number1 + " + " + number2 + " = " + addNum(number1 , number2));
    }

    // 2. method to add the two numbers, use return keyword
     static int addNum (int a, int b) {
            return a+b;
     }

     // 4. method to subtract two numbers

    // 5. method to multiply two numbers

    // 6. method to divide two numbers

}
