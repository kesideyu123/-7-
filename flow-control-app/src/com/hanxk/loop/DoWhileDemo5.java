package com.hanxk.loop;

public class DoWhileDemo5 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Hello World");
            i++;
        }while (i < 3);
        do {
            System.out.println("Hello World2");
        }while (false);
    }
}
