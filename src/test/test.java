package test;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个员工号");
            arr[i]=sc.nextInt();
            Random r=new Random();
            int data=r.nextInt(arr.length);
            int temp=arr[data];
            arr[data]=arr[i];
            arr[i]=temp;


        }
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
