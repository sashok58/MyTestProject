package com.test;

/**
 * Created by Z on 5/18/2016.
 */
public class FullInit {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(A.staticX);
        new A();
    }
}
