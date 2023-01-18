//Method overloading: use the same method name, pass on different parameters
// WB Method, number 8, exercise 1: NameOverloading
public class Example2 {
    public static void main(String[] args) { //main method
        // calling the method and pass on the fnames
        myMethod();
        myMethod("Harry"); // Harry as arguments to pass on
        myMethod("John");
        myMethod("Lilly");
        myMethod("Ada", "Lovelace");
        myMethod("Draco", "Lucius", "Malfoy");
    }
    // create new method, pass on fName parameter, no return value
    static void myMethod() { // 1
        System.out.println("Any name is a good name :D");
    }
    static void myMethod (String fName){ // 2
        System.out.println(fName + " Potter");
    }

    static void myMethod (String fName, String lName){ // 3
        System.out.println(fName + " " + lName);
    }

    // overload myMethod with fName, mName, lName
    // from Main, pass on a name with three syllables
    static void myMethod (String fName, String mName, String lName){ // 4
        System.out.println(fName + " " + mName + " " + lName);
    }
}
