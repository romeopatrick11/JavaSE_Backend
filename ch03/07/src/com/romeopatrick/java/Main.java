package com.romeopatrick.java;
import java.math.BigDecimal;
public class Main {

    public static void main(String[] args) {
        double value = .012;
        double pSum = value + value + value;
        System.out.println("the sum without using big decimal" + pSum);
        String strValue =  Double.toString(value);
        BigDecimal bigValue =  new BigDecimal(strValue); //wrapping the value in  a complex object
        System.out.println("the sum is : " + bigValue.add(bigValue).add(bigValue));



    }
}
