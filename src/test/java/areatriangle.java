import java.io.*;
import java.util.Scanner;
public class areatriangle {
    public static void main (String args[])
    {
        Scanner input=new Scanner(System.in);
        double base,height,area;
        System.out.println("Enter length of base");
        base=input.nextDouble();
        System.out.println("Enter length of height");
        height=input.nextDouble();
        area = ( base*height) / 2 ;
        System.out.println("");
        System.out.println("Area of Triangle is: "+area);
    }
}

