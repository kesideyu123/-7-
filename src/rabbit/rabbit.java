package rabbit;

public class rabbit {
    public static void main(String[] args) {
        System.out.println(number(24));

    }
    public  static  int number(int month){
        int  newrabbbit=1,oldrabbit=0,sum=0;

        for (int i = 0; i < month; i++) {

            sum=newrabbbit+oldrabbit;
            int temp=0;
            temp=newrabbbit;
            newrabbbit-=newrabbbit;
            newrabbbit+=oldrabbit;
            oldrabbit+=temp;
        }
        return  sum;
    }
}
