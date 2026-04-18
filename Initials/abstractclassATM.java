// -----------------------------
// PARENT CLASS (ABSTRACT CLASS)
// -----------------------------

// An abstract class cannot be instantiated directly.
// It can have both abstract methods (no body) and concrete methods (with body).
public abstract class abstractclassATM {

    // Instance variable (common to all child classes)
    double intrate; // represents interest rate

    // Constructor of abstract class
    // This will be called when a subclass object is created.
    public abstractclassATM(double intrate) {
        // 'this' refers to the current object (in this case, the parent part of the object)
        this.intrate = intrate;
        // This line executes before the child constructor finishes
    }

    // Abstract methods: must be implemented by all non-abstract subclasses
    abstract void deposit();
    abstract void withdraw();

    // Concrete method: can be used as-is or overridden by the child class
    void display() {
        System.out.println("I am ATM");
    }
}
