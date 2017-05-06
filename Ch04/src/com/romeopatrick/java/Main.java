package com.romeopatrick.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long longVal = 1_000_000_000;
//        System.out.println(longVal);
//        NumberFormat formatter = NumberFormat.getCurrencyInstance();
//        String sValue = formatter.format(longVal);
//        System.out.println(sValue);
        Scanner sc = new Scanner(System.in);
        Locale locale = new Locale(sc.nextLine(),sc.nextLine());
    }
}
