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
        System.out.println("��Ҫ�۵���" + count + "��");
        System.out.println("����ֽ�ź�ȣ�" + paperThickness);
    }
}
