package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n1,n2,select;
        Scanner islem=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        n1=islem.nextInt();
        System.out.print("2. sayıyı giriniz:");
        n2=islem.nextInt();
        System.out.println("Bir seçim yapınız:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        select=islem.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Fark: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım: "+ (n1*n2));
            case 4:
                if (n2!=0)
                { System.out.println("Bölüm: "+(n1/n2));
                    }else {
                    System.out.println("0 etkisiz elemandır.");
                }
            default:
                System.out.println("Geçersiz seçim");


        }
    }
}
