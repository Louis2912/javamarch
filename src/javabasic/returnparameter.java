package javabasic;

public class returnparameter {

    int a=10;
    int b=20;

    public int sum (){
        int c=a+b;
        return c;
    }
    public int multi(){
        int d=a*b;
        return d;
    }
//    public void display(){
//        System.out.println("Sum is "+c);
//    }

    public static void main(String[] args) {
        returnparameter cal = new returnparameter();
        int result = cal.sum();
        System.out.println("Sum is "+result);
        int multiresult = cal.multi();
        System.out.println("Multi is "+multiresult);
    }
}
