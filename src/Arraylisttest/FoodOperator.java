package Arraylisttest;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodlist=new ArrayList<>();

    public void addFood(){
        Food f =new Food();
        Scanner sc =new Scanner(System.in);

        System.out.println("���������Ʒ������");
        String name=sc.next();
        f.setName(name);

        System.out.println("���������Ʒ�ļ۸�");
        double price=sc.nextDouble();
        f.setPrice(price);

        System.out.println("���������Ʒ������");
        String desc=sc.next();
        f.setName(desc);
        foodlist.add(f);
        System.out.println("�ϼܳɹ�");

    }
    public  void showFood(){
        for (int i = 0; i < foodlist.size(); i++) {
            Food f=foodlist.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
            System.out.println("---------------------------");
        }
    }
    public void start(){
        while (true) {
            System.out.println("��ѡ����");
            System.out.println("1�ϼܲ˵�");
            System.out.println("2չʾ�˵�");
            System.out.println("3�˳�");
            Scanner sc=new Scanner(System.in);

            System.out.println("��ѡ�����Ĳ���");
            int command=sc.nextInt();
            switch (command){
                case 1:
                    addFood();
                    break;
                case 2:
                    showFood();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("��������������");
            }
        }
    }
}
