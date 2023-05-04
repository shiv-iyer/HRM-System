// Scanners allow us to ask the user for input! Need to import them
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // e is a variable that will store an object of the Employee class
        // Think about classes as custom data types that we can define
        Employee e = new Employee();

        // We can access the variables in the Employee class.
        e.firstName = "Ah Kow";
        e.lastName = "Tan";

        e.printName();

        // We can create another instance of Employee.
        Employee e2 = new Employee();
        e2.firstName = "Mary";
        e2.lastName = "Sue";

        e2.printName();

        // Even though e and e2 were created from the same class, they can have
        // different values for their variables.

        // Creating a new instance of Employee with the overloaded constructor
        Employee e3 = new Employee("Alan", "Sia", 1000);

        // the next constructor
        Employee e4 = new Employee("Haikal", "Chong");
    }

    public static void calculateBmi() {
        System.out.printf("Hello and welcome!");

        // Create a new scanner
        // System.in essentially refers to the keyboard. in is short for input
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your weight:");
        float weight = sc.nextFloat();

        System.out.println("Please enter your height:");
        float height = sc.nextFloat();

        float bmi = weight / (height * height);

        System.out.println("Your bmi is " + bmi);
    }
}

// Press Opt+Enter with your caret at the highlighted text to see how
// Press Ctrl+R or click the green arrow button in the gutter to run the code.
// Press Ctrl+D to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Cmd+F8.