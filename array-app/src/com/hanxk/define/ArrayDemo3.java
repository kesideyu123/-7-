package com.hanxk.define;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = {12, 24, 36};
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
