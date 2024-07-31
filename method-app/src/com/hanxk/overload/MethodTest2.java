package com.hanxk.overload;

public class MethodTest2 {
    public static void main(String[] args) {
        fire();
        fire("米国");
        fire("米国", 999);
    }
    public static void fire(){
        System.out.println("默认发射了一枚武器给岛国");
    }
    public static void fire(String country){
        System.out.println("发射一枚武器给" + country);
    }
    public static void fire(String country, int number){
        System.out.println("发射" + number + "枚武器给" + country);
    }
}
