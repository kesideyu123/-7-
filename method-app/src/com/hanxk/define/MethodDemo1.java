package com.hanxk.define;

public class MethodDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("和是：" + c);
        int rs = sum(a ,b);
        System.out.println("和是：" + rs);
        int a1 = 20;
        int b1 = 30;
        int c1 = a1 + b1;
        System.out.println("和是：" + c1);
    }
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
}
