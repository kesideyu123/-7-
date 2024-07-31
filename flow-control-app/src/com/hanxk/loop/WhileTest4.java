package com.hanxk.loop;

public class WhileTest4 {
    public static void main(String[] args) {
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while (paperThickness < peakHeight){
            paperThickness *= 2;
            count++;
        }
        System.out.println("需要折叠：" + count + "次");
        System.out.println("最终纸张厚度：" + paperThickness);
    }
}
