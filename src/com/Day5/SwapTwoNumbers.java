package com.Day5;
import java.util.Scanner;
public class SwapTwoNumbers {
        public static void main(String[] args) {
            int x,y,t;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter two numbers x and y : " );
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println("Before Swapping numbers : "+x +" "+y);
            t = x;
            x = y;
            y = t;
            System.out.println("After Swapping numbers : " +x +" "+y);
            System.out.println();
        }

}
