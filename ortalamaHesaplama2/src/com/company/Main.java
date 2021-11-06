package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;
        Scanner islem=new Scanner(System.in);

        System.out.print("Matematik: ");
        mat=islem.nextInt();
        int matDurum=0;
        if (mat>=0 && mat<=100) {
            System.out.println("Matetaik işleme alındı.");
            matDurum++;
        }else{
            mat=0;
            matDurum=0;
            System.out.println("Matetamtik işleme alınmadı");
        }

        System.out.print("Fizik: ");
        fizik=islem.nextInt();
        int fizDurum=0;
        if (fizik>=0 && fizik<=100) {
            System.out.println("Fizik işleme alındı.");
            fizDurum++;
        }else{
            fizik=0;
            fizDurum=0;
            System.out.println("Fizik işleme alınmadı");
        }

        System.out.print("Kimya: ");
        kimya=islem.nextInt();
        int kimDurum=0;
        if (kimya>=0 && kimya<=100) {
            System.out.println("Kimya işleme alındı.");
            kimDurum++;
        }else{
            kimya=0;
            kimDurum=0;
            System.out.println("Kimya işleme alınmadı");
        }

        System.out.print("Müzik: ");
        muzik=islem.nextInt();
        int muzDurum=0;
        if (muzik>=0 && muzik<=100) {
            System.out.println("Müzik işleme alındı.");
            muzDurum++;
        }else{
            muzik=0;
            muzDurum=0;
            System.out.println("Müzik işleme alınmadı");
        }

        System.out.print("Türkçe: ");
        turkce=islem.nextInt();
        int turkDurum=0;
        if (turkce>=0 && turkce<=100) {
            System.out.println("türkçe işleme alındı.");
            turkDurum++;
        }else{
            turkce=0;
            turkDurum=0;
            System.out.println("tükçe işleme alınmadı");
        }

        double ortalama=(turkce+fizik+mat+muzik+kimya)/(turkDurum+muzDurum+kimDurum+fizDurum+matDurum);
        if (ortalama>=55){
            System.out.println("Geçtiniz");
        } else {
            System.out.println("kaldınız.");
        }
        System.out.println("Ortalamanız: "+ortalama);



    }
}
