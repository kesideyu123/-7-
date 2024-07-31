package com.hanxk;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        int[] userNumbers = userSelectNumbers();
        System.out.println("你投注的号码：");
        printArray(userNumbers);
        int[] luckNumbers = createLuckNumbers();
        System.out.println("你中奖的号码：");
        printArray(luckNumbers);
        judge(userNumbers,luckNumbers);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }
    public static int[] userSelectNumbers(){
        int[] numbers = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                System.out.println("请输入第" + (i + 1) + "个红球号码（1-33之间不能重复）：");
                int number = sc.nextInt();
                if(number < 1 || number > 33){
                    System.out.println("你输入的红球号码不在1-33之间");
                }else {
                    if (exist(numbers, number)){
                        System.out.println("你输入的红球号码重复了，请重新选择");
                    }else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.println("请输入蓝球号码");
            int number = sc.nextInt();
            if (number < 1 || number> 16){
                System.out.println("你输入的范围不对");
            }else {
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }


    private static boolean exist(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                break;
            }
            if (numbers[i] == number){
                return true;
            }
        }
        return false;
    }
    public static int[] createLuckNumbers(){
        int[] numbers = new int[7];
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                int number = r.nextInt(33) + 1;
                if (!exist(numbers, number)){
                    numbers[i] = number;
                    break;
                }
            }
        }
        numbers[6] = r.nextInt(16) + 1;
        return numbers;
    }
    public static void judge(int[] userNumbers, int[] luckNumbers){
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < luckNumbers.length; j++) {
                if (luckNumbers[i] == userNumbers[j]){
                    redCount++;
                    break;
                }
            }
        }
        blueCount = userNumbers[6]  == luckNumbers[6] ? 1 : 0;
        System.out.println("你命中的红球数量是" + redCount + "个");
        System.out.println("你命中的蓝球数量是" + blueCount + "个");
        if (redCount == 6 && blueCount == 1){
            System.out.println("恭喜你！中奖1000万");
        }else if (redCount == 6 && blueCount == 0){
            System.out.println("恭喜你！中奖500万");
        }else if (redCount == 5 && blueCount == 1){
            System.out.println("恭喜你！中奖3000元");
        }else if (redCount == 5 && blueCount == 0) {
            System.out.println("恭喜你！中奖200元");
        }else if (redCount == 4 && blueCount == 0){
            System.out.println("恭喜你！中奖10元");
        }else if (redCount == 3 && blueCount == 1){
            System.out.println("恭喜你！中奖5元");
        }else {
            System.out.println("感谢你对福利事业做出的贡献");
        }
    }
}
