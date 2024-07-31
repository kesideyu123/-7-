package com.hanxk.loop;

public class BreakAndContinueDemo8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ÎÒ°®Äã£º" + i);
            if (i == 3){
                break;
            }
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3){
                continue;
            }
            System.out.println("Ï´Íë" + i);
        }
    }
}
