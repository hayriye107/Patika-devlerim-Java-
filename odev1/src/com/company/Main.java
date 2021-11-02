package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner islem=new Scanner(System.in); //Önce scanner sınıfımdan nesne oluşturdum.
        int matematik, fizik, kimya, tarih, muzik; //şimdi veri alacağım değişkenleri oluşturdum ve veri almaya başladım.

        System.out.println("Matematik notu: ");
        matematik=islem.nextInt();

        System.out.println("Fizik notu: ");
        fizik=islem.nextInt();

        System.out.println("Kimya notu: ");
        kimya=islem.nextInt();

        System.out.println("Tarih notu: ");
        tarih=islem.nextInt();

        System.out.println("Müzik notu: ");
        muzik=islem.nextInt();

        //ortalama hesaplatma
        int toplam=matematik+fizik+tarih+kimya+muzik;
        double ort=toplam/5.0;
        System.out.println(ort);

        //kontrol Yapısı
        boolean sonuc=(ort>=60);
        String durum= sonuc ?"Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(durum);










    }
}
