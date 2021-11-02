package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner islem=new Scanner(System.in);
        System.out.print("Tutar: ");
        tutar=islem.nextDouble();

        if (tutar<=1000){
            kdvOran=0.18;
            kdvTutar=tutar*kdvOran;
            kdvliTutar=tutar+kdvTutar;
        }
        else {
            kdvOran=0.8;
            kdvTutar=tutar*kdvOran;
            kdvliTutar=tutar+kdvTutar;
        }
        System.out.println("Tutar: "+tutar);
        System.out.println("KDV Oranı: "+kdvOran);
        System.out.println("KDV Tutarı: "+kdvTutar);
        System.out.println("Toplam: "+kdvliTutar);

    }
}
