package com.test;

/**
 * Created by Z on 6/3/2016.
 */
public class StringSplit {
    public static void main(String[] args) {
        String temp = "Person|Alex|25.0|6.0|FAT_OFF|PROFESSIONAL";
        String [] temp1 = temp.split("\\|");
        for (String s : temp1) {
            System.out.println(s);
        }

    }
}
