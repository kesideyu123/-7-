package com.hanxk.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        int luckNumber = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("�����������²�����ݣ�");
            int guessNumber = sc.nextInt();
            if (guessNumber < luckNumber){
                System.out.println("�����������ƫС");
            }else if(guessNumber > luckNumber){
                System.out.println("�����������ƫ��");
            }else{
                System.out.println("ok");
                break;
            }
        }
    }
}