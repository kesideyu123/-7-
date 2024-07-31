package com.hanxk.define;

public class MethodProblemDemo3 {
    public static void main(String[] args) {
        int rs = sum(10, 20);
        System.out.println(rs);
        System.out.println(sum(10, 90));
        sum(100,200);
        printHelloWorld();
    }
    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
    public static void printHelloWorld(){
        for (int i = 0; i < 3; i++) {
            System.out.println("HelloWorld");
        }
    }
}
