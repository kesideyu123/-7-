package ATM;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    //����atmϵͳ��ӭ����
    public void  start(){
        while (true) {
            System.out.println("=====��ӭ������atmϵͳ===");
            System.out.println("1�û���¼");
            System.out.println("2�û�����");
            System.out.println("��ѡ��");
            int command=sc.nextInt();
            switch (command){
                case 1:
                    //�û���¼
                    break;
                case 2:
                    //�û�����
                    createAccount();
                    break;
                default :
                    System.out.println("====û�иò���==");
            }
        }
    }
    //��ɷ���������
    private void createAccount(){
        System.out.println("====���뿪������====");
        Account acc=new Account();

        System.out.println("�����������û����ƣ�");
        String name=sc.next();
        acc.setUserName(name);

        while (true) {
            System.out.println("�����������Ա�");
            char sex=sc.next().charAt(0);
            if(sex=='��'||sex=='Ů'){
                acc.setSex(sex);
                break;
            }else {
                System.out.println("��������Ա�����ֻ�����л���Ů");
            }
        }

        while (true) {
            System.out.println("���������˻�����");
            String passWord=sc.next();
            System.out.println("������������ȷ������");
            String okPassWord =sc.next();
            if(okPassWord.equals(passWord)){
                acc.setPassword(okPassWord);
                break;
            }else {
                System.out.println("��������������벻һ��");
            }
        }
        System.out.println("��������ȡ�ֵĶ��");
        double limit =sc.nextDouble();
        acc.setLimit(limit);

        accounts.add(acc);
        System.out.println("��ϲ��"+acc.getUserName()+"�����ɹ������Ŀ�����");

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
