package javaapplication8;
import java.util.Scanner;


public class matematikaberaksi {
    public static void main (String args[]){
        int a, b;
        Matematika reaksi = new Matematika();
        
        System.out.println("20 = 20 = " + reaksi.pertambahan(20, 20));
        System.out.println("10 - 5 = " + reaksi.pengurangan(10, 5));
        System.out.println("10 x 20 = " + reaksi.perkalian(10, 20));
        System.out.println("20 / 2 = " + reaksi.pembagian(20, 2));
    }
    
}
