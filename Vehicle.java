/**
 * Vehicle
 */
public interface Vehicle {

    final int gears = 5;

    void changeGear(int a);

    void speedUp(int a);

    void slowDown(int a);

    default void out() {
        System.out.println("Default method");
    }

    // Static method that don't need an instance to call them
    static int math(int b) {
        return b + 9;
    }
}