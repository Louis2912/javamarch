package javabasic;

public class simplemethod {

    public static int land (int length , int width){
        int area = length*width;
        System.out.println("Area of the Land "+area);
        return area;
    }
    public static int landprice(int area, int unitprice){
        int price = area*unitprice;
        System.out.println("Price of the land is "+price);
        return price;
    }

    public static void main(String[] args) {
        land(20,10);
        landprice(land(20,10),10);
    }

}
