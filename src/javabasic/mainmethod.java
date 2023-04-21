package javabasic;

public class mainmethod {

    static int a;

    static void m1(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        a=100;
        m1();

        mainmethod ob =new mainmethod();
        ob.main(200);
    }

    public static void main(int x) {
        a=x;
        m1();
    }
}
