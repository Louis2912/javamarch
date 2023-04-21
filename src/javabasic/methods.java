package javabasic;

public class methods {

    int a;
    int b;
    int sums;
    int subs;
    public void sum (int a, int b){
        int sums= a+b;
        System.out.println("Sum is "+sums);
//        return sums;
    }

    public void sub(int a, int b){
        int subs = a-b;
        System.out.println("sub is "+subs);
//        return subs;

    }

    public void print (){
        System.out.println("Printing the value is " +1000);
        System.out.println("Printing is "+100);
    }

    public int multi (){
        int c=a*b;
        System.out.println("Multi is "+c);
        return c;
    }

    public void divi (int e,int b){
        int div = e/b;
        System.out.println("Div is "+div);
    }

    public static void main(String[] args) {

        methods obj1 = new methods();
        obj1.sum(10,20);
        obj1.sub(50,10);
        obj1.print();

        methods obj2 = new methods();
        obj2.sub(20,10);
        obj2.print();

        methods obj3 = new methods();
        obj3.a=10;
        obj3.b=10;
        obj3.multi();

        methods obj4 = new methods();
        obj4.divi(obj3.multi(), 10);

    }


}
