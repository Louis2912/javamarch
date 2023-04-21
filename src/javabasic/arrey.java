package javabasic;

import javax.sound.midi.Soundbank;

public class arrey {

    public static void main(String[] args) {

        //Arrey using Number

        int arrey[] = {10,20,30,40,50};

//        System.out.println("Value is " +arrey[0]);
//        System.out.println("Value is " +arrey[1]);
//        System.out.println("Value is " +arrey[2]);
//        System.out.println("Value is " +arrey[3]);
//        System.out.println("Value is " +arrey[4]);


        for (int a :arrey){
            System.out.println("Value of Arrey is " +a);
        }
        System.out.println("---------------------------------------");
        System.out.println("Length is "+arrey.length);
        arrey[2] = 100;
        arrey[3] = arrey[2]+20;

        for (int a=0; a<arrey.length; a++){

            System.out.println("value is "+arrey[a]);

        }

        // Arrey Using the String

        String weeks[] = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        System.out.println("String Arrey is --------------------");

        for (String b : weeks){
            System.out.println(b);
        }

        weeks[0] = "Sunday";
        for (int c = 0;c<weeks.length;c++){
            System.out.println(weeks[c]);
        }

        //Multi Diamentional Arrey

        System.out.println("_____________________Multi Arrey _____________________________");

        int number [][] = {{1,2,3},{6,7,8}};

        System.out.println("Value of Multi Arrey is "+number[1][1]);
        for (int i=0; i<number.length;i++ ){
            for (int j=0;j<number[i].length;++j){
                System.out.println("Arrey is "+number[i][j]);
            }
        }

    }
}
