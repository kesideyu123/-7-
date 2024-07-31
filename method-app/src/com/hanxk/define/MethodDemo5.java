package com.hanxk.define;

public class MethodDemo5 {
    public static void main(String[] args) {
        study();
    }
    public static void sleep(){
        System.out.println("Ë¯¾õ");
    }
    public static void eat(){
        System.out.println("³Ô·¹");
    }
    public static void study(){
        eat();
        System.out.println("Ñ§Ï°");
        sleep();
    }
}
