package HasStatic;

public class HasStatic {

    private static int x = 100;
    public static void main(String args[ ]){
        HasStatic hs1 = new HasStatic();
        hs1.x++;
        System.out.println(x);
        HasStatic hs2 = new HasStatic();
        System.out.println(x);
        hs2.x++;
        System.out.println(x);
        hs1=new HasStatic();
        System.out.println(hs1);
        hs1.x++;
        System.out.println(x);
        HasStatic.x--;
        System.out.println(x);
        System.out.println( "x=" +x);

    }

}
