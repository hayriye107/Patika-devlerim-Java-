package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner islem=new Scanner(System.in);
        String burc = "";
        boolean isError = false;
        System.out.print("Doğduğunuz Gün: ");
        int gun = islem.nextInt();
        System.out.print("Doğduğunuz Ay: ");
        int ay=islem.nextInt();

        if (ay==1){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    burc="oğlak";
                }else if (gun>=22){
                    burc="kova";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==2){
            if (gun>=1 && gun<=31){
                if (gun<=19){
                    burc="kova";
                }else if (gun>=20){
                    burc="balık";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==3){
            if (gun>=1 && gun<=31){
                if (gun<=20){
                    burc="balık";
                }else if (gun>=21){
                    burc="koç";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==4){
            if (gun>=1 && gun<=31){
                if (gun<=20){
                    burc="koç";
                }else if (gun>=21){
                    burc="boğa";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==5){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    burc="boğa";
                }else if (gun>=22){
                    burc="ikizler";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==6){
            if (gun>=1 && gun<=31){
                if (gun<=22){
                    burc="koç";
                }else if (gun>=23){
                    burc="boğa";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==7){
            if (gun>=1 && gun<=31){
                if (gun<=22){
                    burc="yengeç";
                }else if (gun>=23){
                    burc="aslan";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==8){
            if (gun>=1 && gun<=31){
                if (gun<=22){
                    burc="aslan";
                }else if (gun>=23){
                    burc="başak";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==9){
            if (gun>=1 && gun<=31){
                if (gun<=22){
                    burc="başak";
                }else if (gun>=23){
                    burc="terazi";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==10){
            if (gun>=1 && gun<=31){
                if (gun<=22){
                    burc="terazi";
                }else if (gun>=23){
                    burc="akrep";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==11){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    burc="koç";
                }else if (gun>=22){
                    burc="boğa";
                }else {
                    isError=true;
                }
            }
        }

        if (ay==12){
            if (gun>=1 && gun<=31){
                if (gun<=21){
                    burc="yay";
                }else if (gun>=22){
                    burc="oğlak";
                }else {
                    isError=true;
                }
            }
        }






        if (isError){
            System.out.println("Hatalı giriş yaptınız.");
        }
        else {
            System.out.println("Doğum tarihiniz: "+gun+"/"+ay+" "+"burcunuz: "+burc);
        }







    }
}
