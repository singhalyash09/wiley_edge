package com.exceptinHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =0,b = 0;
        System.out.println("Enter two numbers to get started : ");
        try{
            a= scan.nextInt();
            b = scan.nextInt();
        }catch (InputMismatchException in){
            System.out.println(in.getMessage());
        }

        try{
            int result = a/b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
