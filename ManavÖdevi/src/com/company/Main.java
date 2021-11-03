package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,toplam;

        Scanner islem=new Scanner(System.in);
        System.out.print("Armut kaç kilo: ");
        armut=islem.nextDouble();
        System.out.print("Elma kaç kilo: ");
        elma=islem.nextDouble();
        System.out.print("Domates kaç kilo: ");
        domates=islem.nextDouble();
        System.out.print("Muz kaç kilo: ");
        muz=islem.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        patlican=islem.nextDouble();

        toplam=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);
        System.out.println("Toplam Tuatar: "+toplam);
    }
}
