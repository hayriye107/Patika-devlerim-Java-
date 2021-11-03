package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r;
        double pi=3.14;
        int merkezAcı;

        Scanner islem=new Scanner(System.in);
        System.out.println("Dairenin yarı çap değerini giriniz.");
        r=islem.nextInt();
        System.out.println("Dairenin merkez açı değerini giriniz.");
        merkezAcı=islem.nextInt();

        double formul= (pi * (r*r) * merkezAcı) / 360;

        System.out.println("Yarıçapı " + r + " merkez açısının ölçüsü "+ merkezAcı +" olan daire diliminin alanı: "+ formul);
    }
}
