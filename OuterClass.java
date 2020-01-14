/**
 * OuterClass
 */
public class OuterClass {
    // Inner class
    // public class InnerClass {

    // public void display() {
    // System.out.println("This is an inner class");
    // }
    // }

    public void inner() {
        class InnerClass {
            public void display() {
                System.out.println("Inner class");
            }
        }

        InnerClass in = new InnerClass();
        in.display();
    }

}