package com.hanxk.demo;

public class Test1 {
    public static void main(String[] args) {
        int[] facescores = {15, 9000, 10000, 20000, 9500, -5};
        int max = facescores[0];
        for (int i = 1; i < facescores.length; i++) {
            if(facescores[i] > max){
                max = facescores[i];
            }
        }
        System.out.println("颜值最高分的是：" + max);
    }
}