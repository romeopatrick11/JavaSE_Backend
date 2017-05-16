package com.romeopatrick.java;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try{
            String str = "Hey I am a string variable to est the length";
            char[] a = str.toCharArray();
            System.out.println("the length of the variable is : " + str.length() +"\n" );
            System.out.println(a[a.length]);

        }catch(ArrayIndexOutOfBoundsException e){
            Scanner sc = new Scanner(System.in);
            System.out.println("Array is out of boundaries");
        }
        }
        }