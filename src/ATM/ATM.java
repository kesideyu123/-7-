package ATM;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    //启动atm系统欢迎界面
    public void  start(){
        while (true) {
            System.out.println("=====欢迎您进入atm系统===");
            System.out.println("1用户登录");
            System.out.println("2用户开户");
            System.out.println("请选择");
            int command=sc.nextInt();
            switch (command){
                case 1:
                    //用户登录
                    break;
                case 2:
                    //用户开户
                    createAccount();
                    break;
                default :
                    System.out.println("====没有该操作==");
            }
        }
    }
    //完成方法：开户
    private void createAccount(){
        System.out.println("====进入开户操作====");
        Account acc=new Account();

        System.out.println("请输入您的用户名称：");
        String name=sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("请输入您的性别：");
            char sex=sc.next().charAt(0);
            if(sex=='男'||sex=='女'){
                acc.setSex(sex);
                break;
            }else {
                System.out.println("您输入的性别有误，只能是男或者女");
            }
        }

        while (true) {
            System.out.println("请您输入账户密码");
            String passWord=sc.next();
            System.out.println("请你输入您的确认密码");
            String okPassWord =sc.next();
            if(okPassWord.equals(passWord)){
                acc.setPassword(okPassWord);
                break;
            }else {
                System.out.println("您两次输入的密码不一致");
            }
        }
        System.out.println("请输入您取现的额度");
        double limit =sc.nextDouble();
        acc.setLimit(limit);

        accounts.add(acc);
        System.out.println("恭喜你"+acc.getUserName()+"开户成功，您的卡号是");

    }
//    private String createCardId(){
//        String cardId="";
//        Random r =new Random();
//        for (int i = 0; i <8 ; i++) {
//            int data=r.nextInt(10);
//            cardId+=data;
//
//        }
//    }

}
