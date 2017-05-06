package com.romeopatrick.java;

import com.sun.javafx.binding.StringFormatter;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//       StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i <2 ; i++) {
//            System.out.print("Enter numeric value number " + i+1 + ": ");
//            sb.append(sc.nextLine());
//            }
//        NumberFormat formatter = NumberFormat.getNumberInstance();
//        double sum = 0;
//        for (int i = 0; i <2 ; i++) {
//            sum = sum + formatter.format(sb);
//
//                    }
//        System.out.println(sb.chars());
        String x = sc.nextLine();
        double d1 = Double.parseDouble(x);
        String x2 = sc.nextLine();
        double d2 = Double.parseDouble(x2);
        System.out.println("the sum is:" + (d1+d2));
    }
}
