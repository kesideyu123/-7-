package speedkey.hello;

public class exercise1 {
    public static void main(String[] args) {
        int totalRabbits = rabbitPopulation(4);
        System.out.println("24个月后，会有一共 " + totalRabbits + " 对兔子。");
    }
    public static int rabbitPopulation(int months){
        if (months <= 1){
            return months;
        }else {
            return rabbitPopulation(months -1) +rabbitPopulation(months -2);
        }
    }
}
