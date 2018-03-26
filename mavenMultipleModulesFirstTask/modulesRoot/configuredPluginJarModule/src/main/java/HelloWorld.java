
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("42");

        int width=10;

        //with lambda
        Drawable d2 = ()-> System.out.println("Drawing "+width);

        d2.draw();
    }
}
