package javabasic;

public class statickey {

    static int a;                  //Non static Variable
    static int b;           //Static Variable

    int c;

    void m1(){
        System.out.println("This is M1 Non static");        //Non Static Method
        a =10;
        c=20;

    }

    static void m2(){
        System.out.println("This is M2 Static Method");      //Static Method
        int sum = a+b;
        System.out.println(+sum);
        b=200;
    }
    static void m3(){
        System.out.println("value of C is " +b);
    }

    public static void main(String[] args) {
        b=100;                                          //Calling Directly static method
        a=50;
        m2();
        m3();

//        statickey obj = new statickey();                //Calling non static using object
//        obj.a = 10;
//        obj.m1();

    }
}
