package com.hanxk;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("ѡ�ֵķ�����" + getAverageScore(6));
    }
    public static double getAverageScore(int number){
        int[] scores = new int[number];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            System.out.println("��������¼��ĵ�" + (i + 1) + "������");
            int score = sc.nextInt();
            scores[i] = score;
        }
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < number; i++) {
            int score = scores[i];
            sum += score;
            if (score > max){
                max = score;
            }
            if (score < min){
                min = score;
            }
        }
        return 1.0 * (sum - max -min) / (number -2);
    }
}
