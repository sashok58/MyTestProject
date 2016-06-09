package com.test;

/**
 * Created by Z on 5/18/2016.
 */
public class A {
    public static int staticX = initStaticX();

    private static int initStaticX() {
        System.out.println("INIT STATIC X");
        return 10;
    }

    private int x = initX();

    private int initX() {
        System.out.println("Init X");
        return 10;
    }

    static {
        System.out.println("STATIC BLOCK");
    }

    {
        System.out.println("Init block");
    }

    public A() {
        System.out.println("Constructor A()");
    }

    public A(int x) {
        this();
        System.out.println("Constructor A(int)");
    }
}
