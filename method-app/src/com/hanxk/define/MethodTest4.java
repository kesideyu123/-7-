package com.hanxk.define;

public class MethodTest4 {
    public static void main(String[] args) {
//        System.out.println("1-10�ĺ��ǣ�" + add(10));
        int rs = add(10);
        System.out.println("1-10�ĺ��ǣ�" + rs);
        int rs2 = add(100);
        System.out.println("1-100�ĺ��ǣ�" + rs2);
        System.out.println("-----");
        judge(10);
        judge(7);
    }

    public static void judge(int number){
        if (number % 2 == 0){
            System.out.println(number + "��ż��");
        }else {
            System.out.println(number + "������");
        }
    }
    public static int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
//            sum = i + sum;
            sum += i;
        }
        return sum;
    }
}
