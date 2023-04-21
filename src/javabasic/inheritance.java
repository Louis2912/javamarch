package javabasic;

public class inheritance {

    static class A{
        int a;
        int b;
        int c;

        void m1(){
            System.out.println(a+b+c);
        }

    }
    static class B extends A{

        int x;
        int y;

        void m2(){
            System.out.println(x+y);
        }
    }

   static class C extends B{
        int p;
        int q;
        int sum;
        void m3(int p, int q){
            this.p = p;
            this.q= q;
            sum = p+q;
            System.out.println("value is "+sum);
        }
    }

    public static void main(String[] args) {
//        A obja = new A();
//        obja.a=10;
//        obja.b=20;
//        obja.c=30;
//        obja.m1();

//        B objb = new B();
//        objb.x=10;
//        objb.y=20;
//        objb.m2();
//        objb.a=10;
//        objb.b=20;
//        objb.c=30;
//        objb.m1();

        C objc = new C();
        objc.a=10;
        objc.b=20;
        objc.c=30;
        objc.m1();

        objc.x=10;
        objc.y=10;
        objc.m2();

        objc.m3(20,20);



    }

}
