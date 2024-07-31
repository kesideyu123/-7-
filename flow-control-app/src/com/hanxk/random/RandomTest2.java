package com.hanxk.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请您输入您猜测的数据：");
            int guessNumber = sc.nextInt();
            if (guessNumber < luckNumber){
                System.out.println("您输入的数据偏小");
            }else if(guessNumber > luckNumber){
                System.out.println("您输入的数据偏大");
            }else{
                System.out.println("ok");
                break;
            }
        }
    }
}