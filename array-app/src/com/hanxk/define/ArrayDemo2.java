package com.hanxk.define;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {12, 24, 36};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
//        System.out.println(arr[3]);

        arr[0] = 66;
        arr[2] = 100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr.length);

        System.out.println(arr.length - 1);//最大索引，前提：元素个数大于0

        int[] arr2 = {};
        System.out.println(arr2.length - 1);
    }
}
