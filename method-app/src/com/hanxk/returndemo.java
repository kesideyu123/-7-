package com.hanxk;

public class returndemo {
    public static void main(String[] args) {
        System.out.println("����ʼ");
        chu(10,0);
        System.out.println("�������");
    }
    public static void chu(int a, int b){
        if (b == 0){
            System.out.println("�������󣬲��ܳ�0");
            return;
        }
        int c = a / b;
        System.out.println(c);
    }
}
