package String;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        for (int i=0;i<3;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入登录名称");
            String loginName=sc.next();
            System.out.println("请输入密码");
            String password=sc.next();
            boolean rs=login(loginName,password);
            if(rs){
                System.out.println("恭喜登录成功");
                break;
            }else {
                System.out.println("登陆失败");
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
