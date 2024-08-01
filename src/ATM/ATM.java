package ATM;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ATM {
    private ArrayList<Account> accounts=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    private  Account loginAcc;//��ס��¼���˻�
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
                    login();
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
            } else{
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


        String newCardId=createCardId();
        acc.setCardId(newCardId);

        accounts.add(acc);
        System.out.println("��ϲ��"+acc.getUserName()+"�����ɹ������Ŀ�����"+acc.getCardId());

    }
//��¼
    private void login(){
        System.out.println("==��½ϵͳ===");
        //���ϵͳ�д����˻����ܽ��룬��Ȼ������
        if(accounts.size()==0){
            System.out.println("û���˻�Ŀǰ�����ȿ���");
            return;
        }
        //ϵͳ��������
        while (true) {
            System.out.println("�����������ĵ�¼����");
            String cardId=sc.next();
            //�ж���������Ƿ����
            Account acc=getAccountByCardId(cardId);
            if(acc==null){
                System.out.println("==������Ŀ��Ų����ڣ���ȷ��====");
            }else{
                while (true) {
                    //���Ŵ��ڣ��������û���������
                    System.out.println("���������¼����");
                    String passWord=sc.next();
                    //�ж������Ƿ���ȷ
                    if(acc.getPassword().equals(passWord)){
                        //������ȷ����¼�ɹ�
                        loginAcc=acc;
                        System.out.println("��ϲ��"+acc.getUserName()+"�ɹ���¼,����Ϊ��"+acc.getCardId());
                        showUserCommand();
                        return;//������������ǰ��¼����
                    }else {
                        System.out.println("����������벻��ȷ,��ȷ��");
                    }
                }
            }
        }
    }
    //��¼��Ľ���
    private  void showUserCommand(){
        while (true) {
            System.out.println(loginAcc.getUserName()+"==������ѡ�����¹��ܽ����˻��Ĵ���==");
            System.out.println("1.��ѯ�˻�");
            System.out.println("2.���");
            System.out.println("3.ȡ��");
            System.out.println("4.ת��");
            System.out.println("5.�����޸�");
            System.out.println("6.�˳�");
            System.out.println("7.ע����ǰ�˻�");
            int command=sc.nextInt();
            switch (command){
                case 1:
                    //��ѯ��ǰ�˻�
                showloginAccount();
                    break;
                case 2:
                    //���
                    depositMoney();
                    break;
                case 3:
                    //ȡ��
                    drawMoney();
                    break;
                case 4:
                    //ת��
                    transferMoney();
                    break;
                case 5:
                    //�����޸�
                    updatePassWord();
                    return;
                case 6:
                    //�˳�
                    System.out.println(loginAcc.getUserName()+"���˳�ϵͳ�ɹ�");
                    return;//������������ǰ����
                case 7:
                    //ע����ǰ�˻�
                    if(deletAccount()){
                     //�����ɹ�
                     //�ص���ӭ����
                     return;
                    }


                    break;
                default:
                    System.out.println("��ǰ�Ĳ����ǲ����ڵģ���ȷ�ϲ���");


            }
        }
    }

    //�˺������޸Ĺ���
    private void updatePassWord() {
        System.out.println("==�˺������޸Ĳ���==");
        while (true) {
            System.out.println("==�������뵱ǰ�˻�������==");
            String passWord=sc.next();
            if (loginAcc.getPassword().equals(passWord)){
                //��ʼ�޸�����
                System.out.println("��������������");
                String newPassWord =sc.next();
                System.out.println("����ȷ������");
                String okPassWord=sc.next();
                if(okPassWord.equals(newPassWord)){
                    //����������ʼ�޸�����
                    loginAcc.setPassword(okPassWord);
                    System.out.println("�����޸ĳɹ�");
                    return;
                }else{
                    System.out.println("��������������벻һ��");
                }

            }else{
                System.out.println("��ǰ��������벻��ȷ");
            }
        }
    }

    //ע���˻�
    private boolean deletAccount() {
        System.out.println("������������");
        System.out.println("������ȷ��������Y/X");
        String command=sc.next();
        switch (command){
            case "Y":
                if(loginAcc.getMoney()==0){
                    accounts.remove(loginAcc);
                    System.out.println("�����˻��Ѿ��ɹ�����");
                    return true;

                }else{
                    System.out.println("�����˻����ڽ�����������");
                    return false;
                }
            default:
                System.out.println("�õģ������˻�����");
                return false;
        }


    }

    //ת��
    private void transferMoney() {//�û�ת��
        System.out.println("==�û�ת��==");
        if(accounts.size()<2){//�ж��Ƿ��������û�����׬Ǯ
            System.out.println("��ǰϵͳ��ֻ��һ���˻����޷�Ϊ�����˻�ת��");
            return;

        }
        //�ж��˻�����Ƿ���Ǯ
        if(loginAcc.getMoney()==0){
            System.out.println("==���Լ���ûǮ��תʲô==");
            return;
        }

        System.out.println("==����Է��Ŀ���==");
        String cardId=sc.next();
        Account acc=getAccountByCardId(cardId);

        if (acc.getCardId().equals(loginAcc.getCardId())) {
            System.out.println("���ܸ��Լ�תǮ");
            return;

        }
        if(acc==null){
            System.out.println("==�Է�����Ŀ��Ų�����==");
        }  else{
            //��֤����
            String  name="*"+acc.getUserName().substring(1);//��ȡ
            System.out.println("�������롾"+name+"��������");
            String preName=sc.next();
            if(acc.getUserName().startsWith(preName)){
                //startsWith����  �ԣ������ ��ʼ
                //��֤ͨ����
                System.out.println("��������ת���Է��Ľ��");
                double money=sc.nextDouble();
                //�жϽ���Ƿ�û�г����Լ������
                if(loginAcc.getMoney()>=money){
                    //����ת��
                    //�����Լ��������¶Է������
                    loginAcc.setMoney(loginAcc.getMoney()-money);
                    acc.setMoney(acc.getMoney()+money);
                    return;

                }else{
                    System.out.println("�Բ����������޷�ת���Է���ô��Ǯ������ת"+loginAcc.getMoney());
                }
            }else{
                System.out.println("==�Բ�������֤������������==");
            }

        }
    }
//ȡǮ
    private void drawMoney() {
        while (true) {
            System.out.println("==ȡǮ����==");
            //1,�ж��˻�����Ƿ�ﵽ��100Ԫ
            if(loginAcc.getMoney()<100){
                System.out.println("�����˻�����100Ԫ��������ȡǮ");
                return;
            }
            System.out.println("������������ȡ����");
            double money=sc.nextDouble();
            if(loginAcc.getMoney()>=money){
                if(money>loginAcc.getLimit()){
                    System.out.println("����ǰȡ�������ÿ���޶��ÿ������ȡ"+loginAcc.getLimit());
                }else{
                    //��ʼȡǮ,ֱ�Ӹ�������
                    loginAcc.setMoney(loginAcc.getMoney()+money);
                    System.out.println("��ȡ��"+money+"�ɹ���ȡ�����ʣ��"+loginAcc.getMoney());
                    break;

                }

            }else{
                System.out.println("����,�������Ϊ"+loginAcc.getMoney());
            }
        }
    }

    //��Ǯ
    private void depositMoney() {
        System.out.println("==��Ǯ����==");
        System.out.println("�����������Ĵ����");
        double money= sc.nextDouble();


        //���µ�ǰ��¼�˺����
        loginAcc.setMoney(loginAcc.getMoney()+money);
        System.out.println("��ϲ�����"+money+"�ɹ������������"+loginAcc.getMoney());



    }

    //չʾ��ǰ��¼���û���Ϣ
    private  void showloginAccount(){
        System.out.println("����"+loginAcc.getCardId());
        System.out.println("����"+loginAcc.getUserName());
        System.out.println("�Ա�"+loginAcc.getSex());
        System.out.println("���"+loginAcc.getMoney());
        System.out.println("ÿ����ȡ�Ķ��"+loginAcc.getLimit());
    }
    private String createCardId(){
        while (true) {
            //����һ��8λ�����ֵĿ��ţ�������������ǲ��������Ŀ����ظ���
            String cardId="";
            Random r =new Random();
            for (int i = 0; i <8 ; i++) {
                int data=r.nextInt(10);
                cardId+=data;

            }
            Account acc=getAccountByCardId(cardId);
            if(acc==null){
                return cardId;
            }
        }
    }

    private Account getAccountByCardId(String cardId){
        //����ȫ���˺Ŷ���
        for (int i = 0; i < accounts.size(); i++) {
            Account acc=accounts.get(i);
            //�ж�����˻������acc�п����Ƿ�������Ҫ�ҵĿ���
            if(acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return  null;



    }
}
