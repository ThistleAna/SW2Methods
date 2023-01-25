// Workbook 3: Fibonacci Problem
// GitHub: https://github.com/ThistleAna/MethodsJava/blob/master/src/FibonacciProblem.java

import java.math.BigInteger; // use the BigInteger class
public class FibonacciCalc {
    public static void main(String[] args) {
        // call the fibonacci method o print only first 50 numbers
        Fibonacci(100);
    }

    public static void Fibonacci(int counter) {
        BigInteger num1 = BigInteger.ZERO; // BigInteger.valueOf(0)
        BigInteger num2 = BigInteger.ONE; // 0 1 1 2 3 ....

        BigInteger nextNum = BigInteger.ZERO;
        System.out.println(num1);
        System.out.println(num2);

        while (0 < counter-2) {
            System.out.println(nextNum + " ");
            // update num1 and num2
            num1 = num2;
            num2 = nextNum;
            nextNum = num1.add(num2); // use .add method
            counter --;
        }
    }
}
