package Arraylisttest;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodlist=new ArrayList<>();

    public void addFood(){
        Food f =new Food();
        Scanner sc =new Scanner(System.in);

        System.out.println("请你输入菜品的名称");
        String name=sc.next();
        f.setName(name);

        System.out.println("请你输入菜品的价格");
        double price=sc.nextDouble();
        f.setPrice(price);

        System.out.println("请你输入菜品的描述");
        String desc=sc.next();
        f.setName(desc);
        foodlist.add(f);
        System.out.println("上架成功");

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
            System.out.println("请选择功能");
            System.out.println("1上架菜单");
            System.out.println("2展示菜单");
            System.out.println("3退出");
            Scanner sc=new Scanner(System.in);

            System.out.println("请选择您的操作");
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
                    System.out.println("您输入的命令不存在");
            }
        }
    }
}
