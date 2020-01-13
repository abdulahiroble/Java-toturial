public class Main {

    public static void main(String[] args) {
        Dog tim = new Dog("abdu", 21);
        Dog hej = new Dog("seje", 3);
        Cat simba = new Cat("simba", 3, 10);
        Cat bob = new Cat("bob", 7);
        Cat sai = new Cat("Sai");

        bob.speak();
        sai.speak();
        simba.speak();
        hej.speak();
        tim.speak();
    }

    public static void tim(int x, String str) {
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }

    public static int add2(int x) {
        return x + 2;
    }

    public static String str(String x) {
        return x + "!";
    }

}