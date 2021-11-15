package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner islem=new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int yil = islem.nextInt();
        boolean artik = false;

        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;

        if(artik)
            System.out.println(yil + " artık yıldır.");
        else
            System.out.println(yil + " artık yıl değildir.");
    }
}

