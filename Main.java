public class Main {

    public static void main(String[] args) {
        // method if the inner class is private
        // OuterClass out = new OuterClass();
        // out.inner();

        // Method if the inner class is public
        // OuterClass out = new OuterClass();
        // OuterClass.InnerClass in = out.new InnerClass();
        // in.display();

        OuterClass out = new OuterClass();
        out.inner();

        System.out.println();
    }
}