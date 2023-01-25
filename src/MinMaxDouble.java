// to be able to call back the int methods

import java.util.Scanner;
public class MinMaxDouble {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter three numbers : ");

        double number1 = obj.nextDouble();
        double number2 = obj.nextDouble();
        double number3 = obj.nextDouble();
        // call the method
        // determine if the variables are whole numbers or decimale
        // 10 % 1 = 0 => 10 is whole number
        if ( number1 % 1 == 0 && number2 % 1 == 0 && number3 % 1 == 0)
        {
            System.out.println("The biggest number is " + maxNumber(number1, number2, number3));
            System.out.println("The smallest number is " + minNumber(number1, number2, number3));
        }
        else {
            System.out.println("The biggest number is " + maxNumber(number1, number2, number3));
            System.out.println("The smallest number is " + minNumber(number1, number2, number3));
        }






    } //END OF MAIN METHOD

    // method to find the biggest (max)
    static int maxNumber(int a, int b, int c){
        if ( a > b && a > c) {
            return a;
        } else if ( b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    // method to find the smallest (min)
    static int minNumber(int a, int b, int c){
        if ( a < b && a < c) {
            return a;
        } else if ( b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    // method to find the biggest (max)
    static double maxNumber(double a, double b, double c){
        if ( a > b && a > c) {
            return a;
        } else if ( b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    // method to find the smallest (min)
    static double minNumber(double a, double b, double c){
        if ( a < b && a < c) {
            return a;
        } else if ( b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }


}
