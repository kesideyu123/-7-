package com.hanxk.define;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {
        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("�������" + (i + 1) + "��ί�ķ���");
            double score = sc.nextDouble();
            scores[i] = score;
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("ѡ�ֵ����յ÷��ǣ�" + sum / scores.length);
    }
}
