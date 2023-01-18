// static = modifier. A single copy of variable/method is created and shared
// The class 'owns' the static member
public class Methods2 { //main class
    public static void main(String[] args) { // main method
        Methods2 add = new Methods2(); // creating obj of Methods2 main class

        add.addValue();
    }

    // create your own method, not a static method
    public void addValue() { // public method: must be called by creating obj
        int a = 9;
        int b = 8;
        int c = a + b;
        System.out.println(c);
    }
}


