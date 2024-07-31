package com.hanxk.loop;

public class ForDemo2 {
    public static void main(String[] args) {
//        for (int i = 1; i <=100; i++){
//            System.out.println(i);
//        }

//        int sum = 0;
//        for (int i = 1; i <= 100; i++){
////            sum =  sum + i;
//            sum += i;
//        }
//        System.out.println(sum);

//        int sum1 = 0;
//        for (int i = 1; i < 100; i += 2){
//            sum1 += i;
//        }
//        System.out.println("1-100奇数和：\n" + sum1);

        int sum2 = 0;
        for (int i = 1; i < 100; i++){
            if (i % 2 == 1){
                sum2 += i;
            }
        }
        System.out.println("1-100奇数和：" +sum2);
    }
}
