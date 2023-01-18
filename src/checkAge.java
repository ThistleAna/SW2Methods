public class checkAge {
    // create method checkAge() to check the age of the player
    // use if else to determine their age
    static void checkAge(int age){ // pass on age parameter
        if (age < 18) {
            System.out.println("Access denied!");
        } else {
            System.out.println("Access granted!");
        }
    }

    //main method here, call the checkAge() method, pass on age=20
    public static void main(String[] args) {
        checkAge(20); // granted
        checkAge(12); // denied
        checkAge(15); // denied
        checkAge(32); // granted
    }
}
