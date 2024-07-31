package String;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        for (int i=0;i<3;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ÇëÊäÈëµÇÂ¼Ãû³Æ");
            String loginName=sc.next();
            System.out.println("ÇëÊäÈëÃÜÂë");
            String password=sc.next();
            boolean rs=login(loginName,password);
            if(rs){
                System.out.println("¹§Ï²µÇÂ¼³É¹¦");
                break;
            }else {
                System.out.println("µÇÂ½Ê§°Ü");
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
