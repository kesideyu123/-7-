package com.hanxk.overload;

public class MethodTest2 {
    public static void main(String[] args) {
        fire();
        fire("�׹�");
        fire("�׹�", 999);
    }
    public static void fire(){
        System.out.println("Ĭ�Ϸ�����һö����������");
    }
    public static void fire(String country){
        System.out.println("����һö������" + country);
    }
    public static void fire(String country, int number){
        System.out.println("����" + number + "ö������" + country);
    }
}
