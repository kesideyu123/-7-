package com.hanxk.define;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("------");
        byte[] bytes1 = new byte[3];
        System.out.println(bytes1[0]);
        System.out.println(bytes1[1]);
        System.out.println(bytes1[2]);
        System.out.println("------");
        short[] shorts2 = new short[3];
        System.out.println(shorts2[0]);
        System.out.println(shorts2[1]);
        System.out.println(shorts2[2]);
        System.out.println("------");
        char[] chars3 = new char[3];
        System.out.println((int)chars3[0]);
        System.out.println(chars3[1]);
        System.out.println(chars3[2]);
        System.out.println("------");
        long[] longs4 = new long[3];
        System.out.println(longs4[0]);
        System.out.println(longs4[1]);
        System.out.println(longs4[2]);
        System.out.println("------");
        float[] floats5 = new float[3];
        System.out.println(floats5[0]);
        System.out.println(floats5[1]);
        System.out.println(floats5[2]);
        System.out.println("------");
        double[] doubles6 = new double[3];
        System.out.println(doubles6[0]);
        System.out.println(doubles6[1]);
        System.out.println(doubles6[2]);
        System.out.println("------");
        boolean[] flags7 = new boolean[3];
        flags7[0] = true;
        System.out.println(flags7[0]);
        System.out.println(flags7[1]);
        System.out.println(flags7[2]);
        System.out.println("------");
        String[] names = new String[3];
        names[0] = "abc";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}