package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b,c;
        Scanner islem= new Scanner(System.in);
        System.out.print("A kenarı: ");
        a=islem.nextInt();
        System.out.print("B kenarı: ");
        b=islem.nextInt();
        System.out.print("C kenarı: ");
        c=islem.nextInt();

        double u=(a+b+c)/2;
        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("ucgenin alanı: " + alan);
    }
}
