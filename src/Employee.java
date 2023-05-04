// A 'class' basically contains functions and variables
public class Employee {
    // variables
    public String firstName;
    public String lastName;

    // functions, technically known as 'methods'

    void setFirstName(String firstName) {
        // 'this' will always refer to something within the class.
        // optional, but if you need to be specific, it's there.
        this.firstName = firstName;
    }
    void printName() {
        // when we refer to a variable in a method,
        // Java can infer whether it belongs to the class
        // Therefore, no need for this.firstName in here.
        System.out.println(firstName + " " + lastName);
    }
}

// 'this' is the same as 'self' Python