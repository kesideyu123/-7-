package com.hanxk.loop;

public class BreakAndContinueDemo8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("�Ұ��㣺" + i);
            if (i == 3){
                break;
            }
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("ϴ��" + i);
        }
    }
}
