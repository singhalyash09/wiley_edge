package com.functionalinterfaceandlambda;

interface StringLength{
    int length(String str);
}

interface TwoNumbersMax{
    int maxNum(int a, int b);
}

interface StringBlank{
    String checkBlank(String str);
}

public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        StringLength stringLength = str -> str.length();
        System.out.println(stringLength.length("Yash"));

        TwoNumbersMax twoNumbersMax = (a,b) -> a>b ? a : b;
        System.out.println(twoNumbersMax.maxNum(5,9));

        StringBlank stringBlank = str -> str.isEmpty()? "Yes" : "No";
        System.out.println(stringBlank.checkBlank("Not Empty"));
    }

}
