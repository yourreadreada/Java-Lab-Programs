public class ProgCons
{
    // Data Members
    String name;
    int age;
    int prn;
    String branch;
    String division;

    ProgCons() // Default Constructor
    {
        System.out.println("Default Constructor:");
        name = "Name";
        age = 0;
        prn = 0;
        branch = "Branch";
        division = "Division";
    }

    ProgCons(String n, int a, int p, String b, String s) // Parameterized Constructor
    {
        System.out.println("Parameterized Constructor:");
        this.name = n;
        this.age = a;
        this.prn = p;
        this.branch = b;
        this.division = s;
        // this keyword - is a reference variable pointing directly to the current object inside a method or constructor. Primarily used to eliminate name confusion when instance variables and parameters share the exact same name.
        // final keyword - disallow overwriting existing values. A non-access modifier used to restrict further modification of classes, methods, and variables. It acts as a safety mechanism to enforce immutability and prevent unauthorized inheritance.
    }

    ProgCons(ProgCons obj) // Copy Constructor
    {
        System.out.println("Copy Constructor:");
        this.name = obj.name;
        this.age = obj.age;
        this.prn = obj.prn;
        this.branch = obj.branch;
        this.division = obj.division;
    }

    public void display() // Function To Display Details
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(prn);
        System.out.println(branch);
        System.out.println(division);
    }

    public static void main(String args[]) // Main Method
    {
        ProgCons dc = new ProgCons(); // Object Creation For Default Constructor
        dc.display();

        System.out.println(); // Line Separation

        ProgCons pc = new ProgCons("Raghav",19,235,"CSE amd Ex-AI & ML","C2 (SY)"); // Object Creation For Parameterized Constructor
        pc.display();

        System.out.println(); // Line Separation

        ProgCons cc1 = new ProgCons(pc); // Object Creation For Copy Constructor
        // Passing Parameterized Constructor To Copy Constructor
        cc1.display();

        System.out.println(); // Line Separation

        ProgCons cc2 = new ProgCons(dc); // Object Creation For Copy Constructor
        // Passing Default Constructor To Copy Constructor
        cc2.display();
    }
}