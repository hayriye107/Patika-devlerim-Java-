package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner islem=new Scanner(System.in);
        System.out.print("Mesafe: ");
        int mesafe=islem.nextInt();
        System.out.print("Yaş: ");
        int yas=islem.nextInt();
        System.out.print("Yolculuk Tipi: Tek Yön => 1 ,gidiş geliş =>2: ");
        int yolculukTipi=islem.nextInt();
        double indirimsizBilet= mesafe*0.1;
        double biletFiyati = 0;

      if (yas<=11){
          biletFiyati=indirimsizBilet-(indirimsizBilet*0.5);
      }else if (yas>=12 && yas<=24){
          biletFiyati=indirimsizBilet-(indirimsizBilet*0.1);
      }
      else {
          biletFiyati=indirimsizBilet-(indirimsizBilet*0.3);
      }
        switch (yolculukTipi) {
            case 1 -> System.out.println("Bilet Fiyatınız: " + biletFiyati);
            case 2 -> {
                double toplam = 2 * (biletFiyati - (biletFiyati * 0.2));
                System.out.println("Bilet Fiyatınız: " + toplam);
            }
        }


    }


}
