package com.hanxk.define;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("员工的销售总额是：" + sum);
    }
}