package javabasic;

public class conditionalstatement {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int time= 30;

        //Checking the Highest number

//        if (a>b){
//            System.out.println("The Highest Number is " +a);
//        }
//        System.out.println("The Highest Number is "+b);
//        System.out.println("out of the condition");

//        if (a>b) {
//            System.out.println("The Highest Number is " + a);
//        } else {
//            System.out.println("The Highest Number is " + b);
//            System.out.println("Inside of the Condition");
//        }
//        System.out.println("out of the condition");

        if (time<12){
            System.out.println("Good Morning");
        }
        else if (time<22){
            System.out.println("Good Afternoon");
        }
        else if (time<=24){
            System.out.println("Good night");
        }
        else {
            System.out.println("Error Time");
        }

    }
}

