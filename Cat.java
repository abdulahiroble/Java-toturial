/**
 * Cat
 */
public class Cat extends Dog {

    private int food;

    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public Cat(String name, int age) {
        super(name, age);
        // food has not been provided in the parameters
        // so we define our own also known as default values
        this.food = 50;
    }

    public Cat(String name) {
        // age has not been provided in the parameters
        // so we define our own also known as default values
        super(name, 0);
    }

    public void speak() {
        System.out.println("Meow my name is " + this.name + " and I get fed " + this.food);
    }

}