package String;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        for (int i=0;i<3;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("�������¼����");
            String loginName=sc.next();
            System.out.println("����������");
            String password=sc.next();
            boolean rs=login(loginName,password);
            if(rs){
                System.out.println("��ϲ��¼�ɹ�");
                break;
            }else {
                System.out.println("��½ʧ��");
            }
        }


    }
    public static boolean login(String loginNanme ,String password){
     String okloginName="kesideyu";
     String okpassword="123456";
     if (okloginName.equals(loginNanme)&&okpassword.equals(password)){
         return true;
     }else {
         return false;
     }
    }
}
