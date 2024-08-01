package ATM;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ATM {
    private ArrayList<Account> accounts=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);
    private  Account loginAcc;//记住登录的账户
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
                    login();
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
            } else{
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


        String newCardId=createCardId();
        acc.setCardId(newCardId);

        accounts.add(acc);
        System.out.println("恭喜你"+acc.getUserName()+"开户成功，您的卡号是"+acc.getCardId());

    }
//登录
    private void login(){
        System.out.println("==登陆系统===");
        //如果系统中存在账户才能进入，不然就跳出
        if(accounts.size()==0){
            System.out.println("没有账户目前，请先开户");
            return;
        }
        //系统中有数据
        while (true) {
            System.out.println("请宁输入您的登录卡号");
            String cardId=sc.next();
            //判断这个卡号是否存在
            Account acc=getAccountByCardId(cardId);
            if(acc==null){
                System.out.println("==您输入的卡号不存在，请确认====");
            }else{
                while (true) {
                    //卡号存在，接着让用户输入密码
                    System.out.println("请您输入登录密码");
                    String passWord=sc.next();
                    //判断密码是否正确
                    if(acc.getPassword().equals(passWord)){
                        //密码正确，登录成功
                        loginAcc=acc;
                        System.out.println("恭喜你"+acc.getUserName()+"成功登录,卡号为："+acc.getCardId());
                        showUserCommand();
                        return;//跳出并结束当前登录方法
                    }else {
                        System.out.println("您输入的密码不正确,请确认");
                    }
                }
            }
        }
    }
    //登录后的界面
    private  void showUserCommand(){
        while (true) {
            System.out.println(loginAcc.getUserName()+"==您可以选择如下功能进行账户的处理==");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.密码修改");
            System.out.println("6.退出");
            System.out.println("7.注销当前账户");
            int command=sc.nextInt();
            switch (command){
                case 1:
                    //查询当前账户
                showloginAccount();
                    break;
                case 2:
                    //存款
                    depositMoney();
                    break;
                case 3:
                    //取款
                    drawMoney();
                    break;
                case 4:
                    //转账
                    transferMoney();
                    break;
                case 5:
                    //密码修改
                    updatePassWord();
                    return;
                case 6:
                    //退出
                    System.out.println(loginAcc.getUserName()+"您退出系统成功");
                    return;//跳出并结束当前方法
                case 7:
                    //注销当前账户
                    if(deletAccount()){
                     //销户成功
                     //回到欢迎界面
                     return;
                    }


                    break;
                default:
                    System.out.println("当前的操作是不存在的，请确认操作");


            }
        }
    }

    //账号密码修改工作
    private void updatePassWord() {
        System.out.println("==账号密码修改操作==");
        while (true) {
            System.out.println("==请你输入当前账户的密码==");
            String passWord=sc.next();
            if (loginAcc.getPassword().equals(passWord)){
                //开始修改密码
                System.out.println("请您输入新密码");
                String newPassWord =sc.next();
                System.out.println("请您确认密码");
                String okPassWord=sc.next();
                if(okPassWord.equals(newPassWord)){
                    //可以真正开始修改密码
                    loginAcc.setPassword(okPassWord);
                    System.out.println("密码修改成功");
                    return;
                }else{
                    System.out.println("您输入的两次密码不一致");
                }

            }else{
                System.out.println("当前输入的密码不正确");
            }
        }
    }

    //注销账户
    private boolean deletAccount() {
        System.out.println("进行销户操作");
        System.out.println("请问您确认销户吗Y/X");
        String command=sc.next();
        switch (command){
            case "Y":
                if(loginAcc.getMoney()==0){
                    accounts.remove(loginAcc);
                    System.out.println("您的账户已经成功销户");
                    return true;

                }else{
                    System.out.println("您的账户存在金额，不允许销户");
                    return false;
                }
            default:
                System.out.println("好的，您的账户保留");
                return false;
        }


    }

    //转账
    private void transferMoney() {//用户转账
        System.out.println("==用户转账==");
        if(accounts.size()<2){//判断是否有两个用户可以赚钱
            System.out.println("当前系统中只有一个账户，无法为其他账户转账");
            return;

        }
        //判断账户余额是否有钱
        if(loginAcc.getMoney()==0){
            System.out.println("==你自己都没钱你转什么==");
            return;
        }

        System.out.println("==输入对方的卡号==");
        String cardId=sc.next();
        Account acc=getAccountByCardId(cardId);

        if (acc.getCardId().equals(loginAcc.getCardId())) {
            System.out.println("不能给自己转钱");
            return;

        }
        if(acc==null){
            System.out.println("==对方输入的卡号不存在==");
        }  else{
            //认证姓氏
            String  name="*"+acc.getUserName().substring(1);//截取
            System.out.println("请您输入【"+name+"】的姓氏");
            String preName=sc.next();
            if(acc.getUserName().startsWith(preName)){
                //startsWith（）  以（）里的 开始
                //认证通过了
                System.out.println("请您输入转给对方的金额");
                double money=sc.nextDouble();
                //判断金额是否没有超过自己的余额
                if(loginAcc.getMoney()>=money){
                    //可以转了
                    //更新自己的余额，更新对方的余额
                    loginAcc.setMoney(loginAcc.getMoney()-money);
                    acc.setMoney(acc.getMoney()+money);
                    return;

                }else{
                    System.out.println("对不起，您余额不足无法转给对方这么多钱，最多可转"+loginAcc.getMoney());
                }
            }else{
                System.out.println("==对不起，您认证的姓氏有问题==");
            }

        }
    }
//取钱
    private void drawMoney() {
        while (true) {
            System.out.println("==取钱操作==");
            //1,判断账户余额是否达到了100元
            if(loginAcc.getMoney()<100){
                System.out.println("您的账户余额不足100元，不允许取钱");
                return;
            }
            System.out.println("请您输入您的取款金额");
            double money=sc.nextDouble();
            if(loginAcc.getMoney()>=money){
                if(money>loginAcc.getLimit()){
                    System.out.println("您当前取款金额超过了每次限额，您每次最多可取"+loginAcc.getLimit());
                }else{
                    //开始取钱,直接更新余额即可
                    loginAcc.setMoney(loginAcc.getMoney()+money);
                    System.out.println("您取款"+money+"成功，取款后您剩余"+loginAcc.getMoney());
                    break;

                }

            }else{
                System.out.println("余额不足,您的余额为"+loginAcc.getMoney());
            }
        }
    }

    //存钱
    private void depositMoney() {
        System.out.println("==存钱操作==");
        System.out.println("请你输入您的存款金额");
        double money= sc.nextDouble();


        //更新当前登录账号余额
        loginAcc.setMoney(loginAcc.getMoney()+money);
        System.out.println("恭喜您存款"+money+"成功，存款后余额是"+loginAcc.getMoney());



    }

    //展示当前登录的用户信息
    private  void showloginAccount(){
        System.out.println("卡号"+loginAcc.getCardId());
        System.out.println("户主"+loginAcc.getUserName());
        System.out.println("性别"+loginAcc.getSex());
        System.out.println("余额"+loginAcc.getMoney());
        System.out.println("每次提取的额度"+loginAcc.getLimit());
    }
    private String createCardId(){
        while (true) {
            //定义一个8位的数字的卡号，而且这个卡号是不与其他的卡号重复的
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
        //便利全部账号对象
        for (int i = 0; i < accounts.size(); i++) {
            Account acc=accounts.get(i);
            //判断这个账户对象的acc中卡号是否事我们要找的卡号
            if(acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return  null;



    }
}
