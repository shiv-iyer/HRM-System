// A 'class' basically contains functions and variables
public class Employee {
    // variables
    public String firstName;
    public String lastName;
    // Salary should be private: forces every class to go through
    // setSalary ('gatekeeper') in order to modify it.
    private int salary;

    // functions, technically known as 'methods'

    // constructor!
    // Constructors are special: their name will be the same as the
    // name of the class, and there is no return type.
    Employee() {
        // default constructor: used to create all objects from the employee class
        firstName = "N/A";
        lastName = "N/A";
        salary = 0;
    }

    // Overloaded constructor: can accept values
    Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // you can have as many constructors as you want! As long as params are diff.
    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        salary = 0;
    }

    public void setFirstName(String firstName) {
        // 'this' will always refer to something within the class.
        // optional, but if you need to be specific, it's there.
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int newSalary) {
        if (newSalary >= 0)
            this.salary = newSalary;
    }

    public int getSalary () {
        return this.salary;
    }

    public String getFullName() {
        return (this.firstName + " " + this.lastName);
    }
    public void printName() {
        // when we refer to a variable in a method,
        // Java can infer whether it belongs to the class
        // Therefore, no need for this.firstName in here.
        System.out.println(firstName + " " + lastName);
    }
}

// 'this' is the same as 'self' Python