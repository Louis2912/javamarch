package javabasic;

public class stringmethods {
    public static void main(String[] args) {

        // Length of String

        String s = "Automation";
//        int a = s.length();
//        System.out.println(a);
        System.out.println("Length is "+s.length());
//        s.length();

        //Concat

        String s1 = "Trainning";
        System.out.println("The Final String is " +s+" "+s1); // First method using plus

//        s1.concat(s);
        System.out.println("The String is " +s1.concat(s));  // using concat method

        System.out.println("Automation"+" "+"Trainning");   // Using the Direct Values

        System.out.println("Welcome".concat(" Training"));
        System.out.println("Elsin"+"raja");
        System.out.println("jose".concat("priston"));

        //Equals

        String s2 = "HEllO";
        String s3 = "hello";
        s2.equals(s3);                                   //Checking Same or not
        System.out.println(s2.equals(s3));

        s2.equalsIgnoreCase(s3);                        //Checking Same or not with equals ignore case
        System.out.println(s2.equalsIgnoreCase(s3));

        //Contains

//        String s = "Automation";
        String s4 = "auto";

        s.contains("tom");
        System.out.println(s.contains("tom"));                          // Contains using Values

        s.toLowerCase().contains(s4.toLowerCase());                         //Contains using Variables
        System.out.println(s.toLowerCase().contains(s4.toLowerCase()));

        //Sub String

        String substring = s.substring(0,4);
        System.out.println("Sub string is " +substring);

        String substring1 = s.substring(6,10);
        System.out.println("Sub is "+substring1);


        //Replace

        s.replace('o','b');                         // Replce the Charactor
        System.out.println(s.replace('o','b'));


        String newstring = s1.replace("nning","noit");    //Replace the String
        System.out.println("New string is "+newstring);


    }
}
