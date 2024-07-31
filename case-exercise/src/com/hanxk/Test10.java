package com.hanxk;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        int[] userNumbers = userSelectNumbers();
        System.out.println("��Ͷע�ĺ��룺");
        printArray(userNumbers);
        int[] luckNumbers = createLuckNumbers();
        System.out.println("���н��ĺ��룺");
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
                System.out.println("�������" + (i + 1) + "��������루1-33֮�䲻���ظ�����");
                int number = sc.nextInt();
                if(number < 1 || number > 33){
                    System.out.println("������ĺ�����벻��1-33֮��");
                }else {
                    if (exist(numbers, number)){
                        System.out.println("������ĺ�������ظ��ˣ�������ѡ��");
                    }else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.println("�������������");
            int number = sc.nextInt();
            if (number < 1 || number> 16){
                System.out.println("������ķ�Χ����");
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
        System.out.println("�����еĺ���������" + redCount + "��");
        System.out.println("�����е�����������" + blueCount + "��");
        if (redCount == 6 && blueCount == 1){
            System.out.println("��ϲ�㣡�н�1000��");
        }else if (redCount == 6 && blueCount == 0){
            System.out.println("��ϲ�㣡�н�500��");
        }else if (redCount == 5 && blueCount == 1){
            System.out.println("��ϲ�㣡�н�3000Ԫ");
        }else if (redCount == 5 && blueCount == 0) {
            System.out.println("��ϲ�㣡�н�200Ԫ");
        }else if (redCount == 4 && blueCount == 0){
            System.out.println("��ϲ�㣡�н�10Ԫ");
        }else if (redCount == 3 && blueCount == 1){
            System.out.println("��ϲ�㣡�н�5Ԫ");
        }else {
            System.out.println("��л��Ը�����ҵ�����Ĺ���");
        }
    }
}
