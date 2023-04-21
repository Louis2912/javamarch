package javabasic;

public class consover {

    int a= 0;
    int b=0;
    double c= 0;

    consover(){                        // 1st constructor
        a = 10;
        b= 20;
        c=20.5;
        System.out.println("One");
    }

    consover (int x, int y){           //2nd constructor
        a=x;
        b=y;
        System.out.println("Two");
    }
    consover (int x, double y){        //3rd constructor
        a=x;
        c=y;
        System.out.println("Three");
    }
    consover(int x,int y, double z){      //4th constructor
        a=x;
        b=y;
        c=z;
        System.out.println("Four");
    }
    consover(int x, double y ,int z){      //5th constructor
        a=x;
        c=y;
        b=z;
        System.out.println("Five");
    }
    void display(){
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
        System.out.println("Value of c is "+c);
    }
    public static void main(String[] args) {

        consover csover = new consover();       // Calling first Constructor
        csover.display();

        consover csover1 = new consover(10,10.5);   //Calling Third Constructor
        csover1.display();

        consover csover2 = new consover(10,10);     // 2nd constructor
        csover2.display();

        consover csover3 = new consover(10,10.5,10);    //5th Constructor
        csover3.display();

        consover csover4 = new consover(10,10,10.5);    //4th Constructor
        csover4.display();

    }
}
