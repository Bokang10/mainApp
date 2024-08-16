// ParentClass.java
/*
 * Student Number: [st10446180]Seonya Bokang
 * Class: ParentClass
 * Description: This is the parent class containing two fields and a constructor
 * that initializes these fields. It also contains a method called display().
 */
public class ParentClass {
    private String parentAttribute1;
    private int parentAttribute2;

    // Constructor for ParentClass
    public ParentClass(String parentAttribute1, int parentAttribute2) {
        this.parentAttribute1 = parentAttribute1;
        this.parentAttribute2 = parentAttribute2;
    }

    // Method to display the parent class attributes
    public void display() {
        System.out.println("Parent Class - Attribute 1: " + parentAttribute1 + ", Attribute 2: " + parentAttribute2);
    }
}
