package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner islem=new Scanner(System.in);
        double boy, kilo,vki;
        System.out.print("Boyunuzu (metre cinsinde) giriniz: ");
        boy=islem.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo=islem.nextDouble();

        vki=kilo/(boy*boy);

        System.out.print("Vücüt kitle Endeksiniz: "+vki);


    }
}
