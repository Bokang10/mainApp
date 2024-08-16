// MainApplication.java
/*
 * Student Number: [st10446180]Seonya Bokang
 * Application: MainApplication
 * Description: This application creates objects of ParentClass and ChildClass,
 * passes parameters to their constructors, and calls the display() method to
 * demonstrate the output.
 */
public class MainApplication {
    public static void main(String[] args) {
        // Create an object of ParentClass
        ParentClass parentObject = new ParentClass("ParentValue1", 10);

        // Create an object of ChildClass
        ChildClass childObject = new ChildClass("ParentValue1", 10, "ChildValue1", 20.5, true);

        // Display information from the parent class object
        parentObject.display();

        // Display information from the child class object (which also calls the parent class method)
        childObject.display();
    }
}
