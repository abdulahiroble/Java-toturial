public class Dog {

    protected static int count = 0;

    // attributes
    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.count += 1;

        // Part of the instance
        // this.display2();

        Dog.display();
    }

    // regular method
    public void display2() {
        System.out.println("I am a Cat");
    }

    // static method
    public static void display() {
        System.out.println("I am a dog");
    }
}
