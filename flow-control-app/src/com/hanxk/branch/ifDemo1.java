package com.hanxk.branch;

public class ifDemo1 {
    public static void main(String[] args) {
        double money = 60.2;
        if (money > 60){
            System.out.println("���ͺ���ɹ�");
        }else {
            System.out.println("����");
        }

        int score = 57;
        if (score >= 60 && score <70){
            System.out.println("���ļ�Ч�����ǣ�D");
        }else if (score >= 70 && score < 80){
            System.out.println("���ļ�Ч�����ǣ�C");
        }else if (score >= 80 && score < 90){
            System.out.println("���ļ�Ч�����ǣ�B");
        }else if (score >=90 && score <= 100){
            System.out.println("���ļ�Ч�����ǣ�A");
        }else if (score > 100){
            System.out.println("������ķ�����Ч");
        }
        else {
            System.out.println("���ļ�Ч���ϸ�");
        }
    }
}