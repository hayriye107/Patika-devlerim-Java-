package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner islem=new Scanner(System.in);
        int sayi1,sayi2,sayi3;

        System.out.print("Birinci Sayıyı Giriniz: ");
        sayi1=islem.nextInt();

        System.out.print("ikinci Sayıyı Giriniz: ");
        sayi2=islem.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz: ");
        sayi3=islem.nextInt();

       if ((sayi2<sayi1)&&(sayi3<sayi1)){
           if (sayi3<sayi2){
               System.out.println(sayi3+" >"+sayi2+" >"+sayi1);
           }else {
               System.out.println(sayi2+" >"+sayi3+" >"+sayi1);
           }
       }else if ((sayi1<sayi2)&&(sayi3<sayi2)){
           if (sayi1<sayi3){
               System.out.println(sayi2+" >"+sayi3+" >"+sayi2);
           }else{
               System.out.println(sayi3+" >"+sayi2+" >"+sayi2);
           }
       }else{
           if ((sayi1<sayi3)&&(sayi2<sayi3)){
               if (sayi2<sayi1){
                   System.out.println(sayi2+" >"+sayi1+" >"+sayi3);
               }else{
                   System.out.println(sayi3+" >"+sayi2+" >"+sayi3);
               }
           }
       }


    }
}
