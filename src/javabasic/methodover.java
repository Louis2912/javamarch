package javabasic;

public class methodover {

    int a ;
    int b;
    void sum(){                                 //First Method
        a=10;
        b=20;
        int sum = a+b;
        System.out.println("1.Sum is " +sum);
    }

    void sum(int x, int y){                     //Second Method
        int a = x;
        int b = y;
        int sum = a+b;
        System.out.println("2.Sum is "+sum);
    }
    void sum(int x, int y , int z){             //Third Method
        int sum = x+y+z;
        System.out.println("3.Sum is "+sum);
    }
    void sum(int x, double y ){                 //Fourth Method
        double sum = x+y;
        System.out.println("4.Sum is "+sum);
    }
    void sum(double x, int y){                  //Fifth Method
        double sum = x+y;
        System.out.println("5.Sum is "+sum);
    }

    public static void main(String[] args) {
        methodover mover = new methodover();
        mover.sum();                            // Calling First method
        mover.sum(10,20);                  //Calling Second Method
        mover.sum(10,20,30);            //Calling Third Method
        mover.sum(10.5,20);                 //Calling Fifth Method
        mover.sum(10,20.5);                 //Calling Fourth method
    }

}
