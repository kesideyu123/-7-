package hello;

import java.util.Random;
import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        double[]arr=new double[6];//动态数组
        Scanner sc=new Scanner(System.in);
        double sum=0;
        double max=arr[0];
        System.out.println("你好");
        System.out.println("请输入评分呢");

        for (int i=0; i<arr.length;i++) {
//            Random r=new Random();
//            int data = r.nextInt(10)+1;


            arr[i]=sc.nextDouble();


            if (arr[i]>max){
                max=arr[i];
            }


            sum+=arr[i];




//            int[]arr2={1,2,3};//静态数组


//            System.out.println(data);
        }
        System.out.println(sum/arr.length);
        System.out.println(max);

    }
}
