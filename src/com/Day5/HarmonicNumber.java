package com.Day5;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Number to check nth harmonic : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("The harmonic series is :");
        double result = 0.0;
        while(num > 0)
        {
            result = result + (double) 1 / num;
            num --;
            System.out.println(result +" ");
        }
        System.out.println(" ");
        System.out.println(" Output of harmonic series is : " +result);
    }



}
