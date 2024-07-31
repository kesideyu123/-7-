package com.hanxk;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int[] money = {520, 9, 99, 999, 1314};
        start(money);
//        int[] money = {520, 9, 99, 999, 1314};
//        start(money);
    }
    public static void start(int[] moneys){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i <= 5; i++) {
            System.out.println("请输入任意内容进行抽奖：");
            sc.next();
            while (true) {
                int index = r.nextInt(moneys.length);
                int money = moneys[index];
                if(money != 0){
                    System.out.println("恭喜你抽中红包金额为" + money + "的红包");
                    moneys[index] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束");
    }
//    public static void start(int[] money){
//        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//        for (int i = 0; i <= 5; i++) {
//            System.out.println("请输入任意内容进行抽奖：");
//            sc.next();
//            while (true) {
//                int index = r.nextInt(money.length);
//                int moneys = money[index];
//                if(moneys != 0){
//                    System.out.println("恭喜你抽中红包金额为" + moneys + "的红包");
//                    money[index] = 0;
//                    break;
//                }
//            }
//        }
//        System.out.println("活动结束");
//    public static void reverse(int[] moneys){
//        for (int i = 0, j = moneys.length - 1; i < j; i++, j--) {
//            int temp = moneys[j];
//            moneys[j] = moneys[i];
//            moneys[i] = temp;
//        }
//    }
}