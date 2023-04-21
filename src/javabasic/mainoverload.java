package javabasic;

public class mainoverload {

    int a = 0;
    int b= 0;
    void sum(){
        a= 10;
        b=5;
        System.out.println(a+b);
    }

    void sum(int x, int y){
        a=x;
        b=y;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        mainoverload mover = new mainoverload();
//        mover.sum(5,5);
        mover.main();
    }

    public static void main() {
        mainoverload mover1 =  new mainoverload();
        mover1.sum();

    }
}
