package test;

import java.util.Random;
import java.util.Scanner;

public class plane {
    public static void main(String[] args) {
//        double price=calculate(2000,4,"���ò�");
//        System.out.println(price);
//        System.out.println(code(5));
//        System.out.println("ѡ�ֵ÷�"+getAverageScores(6));
//        System.out.println(password(8346));
//        int[] arr={11,22,44,77};
//        int[] arr2=copy(arr);
//        printarr(arr2);
//        int[] moneys={999,88,3333,54,6};
//        start2(moneys);
        float f=42.0f;
        float f1[]=new float[2];
        float f2[]=new float[2];
        float[] f3=f1;
        long x=42;
        f1[0]=42.0f;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f1[0]);
        System.out.println(f1[1]);

        if(f1==f3){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }



    }

    public static double calculate(double price ,int month ,String type){
        if(month>=5&&month<=10){
            switch (type){
                case"ͷ�Ȳ�":
                    price*=0.9;
                    break;
                case "���ò�":
                    price*=0.85;
            }
        }else{
            switch(type){
                case"ͷ�Ȳ�":
                    price*=0.7;
                    break;
                case "���ò�":
                   price*=0.65;
                   break;
            }
        }
        return price;

    }
    //��֤�������
    public static String code( int n ){
        String code="";
        Random r=new Random();
        for (int i = 1; i <n ; i++) {
            //���岻ͬ��������ͣ�һ���������� ���� ��ĸ�Ĵ�Сд
            int type=r.nextInt(3);//�������0��1��2
            switch (type){//������������0 ��ô�������һ������ ��ӽ��յ��ַ�����
                case 0:
                    code+=r.nextInt(10);
                    break;
                case 1://��������������1����ô�������һ����д��ĸ
                    char ch1=(char)(r.nextInt(26)+65);
                    code+=ch1;
                    break;
                case 2:
                    char ch2=(char)(r.nextInt(26)+97);//����������2 ���������Сд��ĸ��
                    code+=ch2;
                    break;
            }



        }
        return code;
    }
    public static double getAverageScores(int number){
        if (number<3){

            return 0;
        }
        int[] scores=new int[number];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <scores.length ; i++) {
            System.out.println("�������"+(i+1)+"����ί������");
            int score=sc.nextInt();
            scores[i]=score;
        }
        int sum=0;
        int max=scores[0];
        int min=scores[0];
        for (int i = 0; i <scores.length ; i++) {
            int score=scores[i];
            sum+=score;

            if (score>max){
                max=score;
            }
            if(score<min){
                min=score;
            }

        }

        return 1.0*(sum-min-max)/(number-2);
    }
    public static String password(int number){
     //�������
        int[] numbers=split(number);
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=(numbers[i]+5)%10;

        }
        reverse(numbers);
        String data="";
        for (int i = 0; i < numbers.length ; i++) {
            data+=numbers[i];
        }
        return data;

    }

    public static void reverse(int[] numbers) {
        //��ת����
        for (int i = 0,j=numbers.length-1; i <j ; i++,j--) {
            int temp=numbers[j];
            numbers[j]=numbers[i];
            numbers[i]=temp;


        }
    }

    public static int[] split(int number) {
        //���
        int[] numbers=new int[4];
        numbers[0]=number/1000;
        numbers[1]=(number/100)%10;
        numbers[2]=(number/10)%10;
        numbers[3]=number%10;
        return numbers;
    }
    public static int[] copy(int[]arr){
        //������������
        int[]arr2=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        return arr2;
    }
    public static void printarr(int[] arr){
        //��ӡ����
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }
    public static void start(int[] moneys){//���ܵ��²�����ȥ��
        //���ȶ���ѭ��5�Σ��������5������������г齱���鵽����0���и�ֵ��Ȼ����һ���޴��ѭ�����ѡ��0����ѭ��
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        for (int i = 0; i <5 ; i++) {
            System.out.println("�������������ݽ��г齱");
            sc.next();
            while (true) {
                int index=r.nextInt(moneys.length);
                int money=moneys[i];
                if(money!=0){
                    System.out.println("��ϲ�����"+money);
                    moneys[index]=0;
                    break;
                }
            }
        }
        System.out.println("����");
    }
    public static void start2(int[] moneys){//������������
        //�漴�����������˳�򣬽��г齱
        Random r=new Random();
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            int data=r.nextInt(moneys.length);
            int temp=moneys[data];
            moneys[data]=moneys[i];
            moneys[i]=temp;
        }
        for (int i=0;i<moneys.length;i++) {
            System.out.println("�������������ݽ��г齱");
            sc.next();

            System.out.println(moneys[i]);
        }
    }
}


