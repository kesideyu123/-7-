package com.hanxk.define;

public class MethodDemo5 {
    public static void main(String[] args) {
        study();
    }
    public static void sleep(){
        System.out.println("˯��");
    }
    public static void eat(){
        System.out.println("�Է�");
    }
    public static void study(){
        eat();
        System.out.println("ѧϰ");
        sleep();
    }
}
