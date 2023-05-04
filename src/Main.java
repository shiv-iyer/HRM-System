// Scanners allow us to ask the user for input!
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("Hello world!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 7; i++) {

            // Create a new scanner
            // System.in essentially refers to the keyboard. in is short for input
            Scanner sc = new Scanner(System.in);
            float weight = sc.nextFloat();

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
}