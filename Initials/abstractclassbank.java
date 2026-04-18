// -----------------------------
// CHILD CLASS (CONCRETE CLASS)
// -----------------------------

// 'abstractclassbank' inherits from 'abstractclassATM' using 'extends' keyword
public class abstractclassbank extends abstractclassATM {

    // Child class specific instance variable
    int cash;

    // Constructor of child class
    // When this runs, it first calls parent constructor using 'super()'
    public abstractclassbank(double intrate, int cash) {
        // ✅ 'super()' must be the first statement in a constructor
        // It calls the parent class's constructor to initialize parent data (intrate)
        super(intrate);

        // After the parent part is initialized, now child variables are initialized
        this.cash = cash;
    }

    // Implementation of abstract method 'withdraw()'
    // This is required because parent declared it as abstract.
    @Override
    public void withdraw() {
        System.out.println("Successfully withdrawn");
        System.out.println("Congratulations! You have withdrawn cash: " + cash);
    }

    // Implementation of abstract method 'deposit()'
    @Override
    public void deposit() {
        System.out.println("Successfully deposited!");
        System.out.println("Congratulations! You have got interest rate of: " + intrate);
    }

    // Overriding the parent's concrete method 'display()'
    // This version will run instead of parent's when called through child object.
    @Override
    public void display() {
        System.out.println("I am Bank");
    }

    // Method unique to the child class (not present in parent)
    public void fun() {
        System.out.println("It's child-specific function");
    }



    // -----------------------------
    // MAIN METHOD (Program starts here)
    // -----------------------------
    public static void main(String[] args) {

        // ❌ abstractclassATM a1 = new abstractclassATM();
        // This is illegal because you cannot create an object of an abstract class.

        // ✅ Upcasting example:
        // Parent reference (abstractclassATM) holding Child object (abstractclassbank)
        abstractclassATM a2 = new abstractclassbank(8.5, 30);

        // ✅ Normal object creation using child class reference
        abstractclassbank a3 = new abstractclassbank(2.5, 30);


        // ----------------------------------
        // Demonstrating POLYMORPHISM (a2)
        // ----------------------------------

        // Even though 'a2' is of parent type,
        // it calls the CHILD versions of deposit(), display(), and withdraw()
        // because of dynamic method dispatch (runtime polymorphism)
        a2.deposit();   // calls abstractclassbank.deposit()
        a2.display();   // calls abstractclassbank.display()
        a2.withdraw();  // calls abstractclassbank.withdraw()

        // ❌ a2.fun(); 
        // Compile-time error: 'fun()' is not defined in parent class (abstractclassATM)
        // Reference type (parent) decides what methods are visible at compile time.


        System.out.println("-------------");


        // ----------------------------------
        // Demonstrating CHILD REFERENCE (a3)
        // ----------------------------------

        // Here, the reference and object both belong to the child class.
        // So it can access everything: inherited methods + child-specific methods.
        a3.deposit();   // calls overridden method in child
        a3.display();   // calls overridden method in child
        a3.withdraw();  // calls overridden method in child
        a3.fun();       // ✅ allowed — method defined only in child class
    }
}