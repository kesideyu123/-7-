package com.hanxk.overload;

public class MethodOverLoadDemo1 {
    public static void main(String[] args) {
        test();
        test(10);
        int c = test(4, 5);
        System.out.println(c);
    }
    public static void test(){
        System.out.println("test1---");
    }
    public static void test(int a){
        System.out.println("test2---" + a);
    }

    void test(double a){

    }
    public static int test(int a, int b){
        return a + b;
    }
}
