package com.hanxk.branch;

public class ifDemo1 {
    public static void main(String[] args) {
        double money = 60.2;
        if (money > 60){
            System.out.println("发送红包成功");
        }else {
            System.out.println("余额不足");
        }

        int score = 57;
        if (score >= 60 && score <70){
            System.out.println("您的绩效级别是：D");
        }else if (score >= 70 && score < 80){
            System.out.println("您的绩效级别是：C");
        }else if (score >= 80 && score < 90){
            System.out.println("您的绩效级别是：B");
        }else if (score >=90 && score <= 100){
            System.out.println("您的绩效级别是：A");
        }else if (score > 100){
            System.out.println("您输入的分数无效");
        }
        else {
            System.out.println("您的绩效不合格");
        }
    }
}