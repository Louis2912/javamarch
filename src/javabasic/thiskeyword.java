package javabasic;

public class thiskeyword {

    int a=0;
    int b=0;
    int c=0;
    int d=0;

    void sum (int x, int y, int z){             //without this keyword
        a=x;
        b=y;
        c=z;
        int sum = x+y+z;
        System.out.println("Sum is "+sum);
    }

    void sum (int a, int b, int c, int d){             //with this keyword
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        int sum =a+b+c+d;
        System.out.println("Sum is "+sum);
    }

    public static void main(String[] args) {
        thiskeyword key = new thiskeyword();
        key.sum(5,10,10);
        key.sum(5,5,5,5);
    }
}
