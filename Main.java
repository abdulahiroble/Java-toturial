public class Main {

    public static void main(String[] args) {
        Dog tim = new Dog("abdu", 21);
        Dog hej = new Dog("seje", 3);

        tim.speak();
        hej.speak();

        // int x = tim.getAge();
        tim.setAge(10);
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