package com.endava;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("42");

        int width=10;

        Drawable d2=()->{
            System.out.println("Drawing "+ width);
        };
        d2.draw();
    }
}
