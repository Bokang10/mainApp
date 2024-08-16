// ChildClass.java
/*
 * Student Number: st 10446180  Seonya Bokang ]
 * Class: ChildClass
 * Description: This is the child class that inherits from ParentClass.
 * It contains three additional fields and a constructor to initialize all five fields.
 * The display() method in this class overrides the method in the ParentClass.
 */
public class ChildClass extends ParentClass {
    private String childAttribute1;
    private double childAttribute2;
    private boolean childAttribute3;

    // Constructor for ChildClass
    public ChildClass(String parentAttribute1, int parentAttribute2, String childAttribute1, double childAttribute2, boolean childAttribute3) {
        // Call the parent class constructor
        super(parentAttribute1, parentAttribute2);
        this.childAttribute1 = childAttribute1;
        this.childAttribute2 = childAttribute2;
        this.childAttribute3 = childAttribute3;
    }

    // Overridden method to display both parent and child class attributes
    @Override
    public void display() {
        // Call the display() method from the parent class
        super.display();

        // Display child class attributes
        System.out.println("Child Class - Attribute 1: " + childAttribute1 + ", Attribute 2: " + childAttribute2 + ", Attribute 3: " + childAttribute3);
    }
}
