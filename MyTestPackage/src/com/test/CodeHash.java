package com.test;

/**
 * Created by Z on 5/17/2016.
 */
public class CodeHash {
    public static void main(String[] args) {
        Object object = new Object();
        int hash = object.hashCode();
        System.out.println("hash = " + hash);
    }
}
