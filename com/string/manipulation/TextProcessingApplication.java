package com.string.manipulation;

public class TextProcessingApplication {
    public static void main(String[] args) {
        String name = "Yash";
        System.out.println(reverseText(name));
    }

    private static int countWords(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {


        }
        return count;
    }
    private static String reverseText(String text){
        StringBuilder str = new StringBuilder(text);
        return String.valueOf(str.reverse());
    }
}
