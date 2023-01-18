// Workbook 3: Fibonacci Problem
// to print the first 50 on the sequence,
// the last sequence is 7778742049 (HINT:IT IS LONG)
public class FibonacciCalc {
    public static void main(String[] args) {
        // call the fibonacci method o print only first 50 numbers
        Fibonacci(50);
    }

    public static void Fibonacci(int counter) {
        int num1 = 0;
        int num2 = 1; // 0 1 1 2 3 ....

        int nextNum = num1+num2;
        System.out.println(num1);
        System.out.println(num2);

        while (0 < counter-2) {
            System.out.println(nextNum + " ");
            // update num1 and num2
            num1 = num2;
            num2 = nextNum;
            nextNum = num1 +num2;
            counter --;
        }
    }
}
