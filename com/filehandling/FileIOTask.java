package com.filehandling;

import java.io.*;
import java.util.Scanner;

public class FileIOTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text to be written");
        String text = scan.nextLine();

        try(Writer writer = new FileWriter("output.txt")){
            writer.append(text).append("Bye");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
