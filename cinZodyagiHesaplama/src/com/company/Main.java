package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner islem=new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili=islem.nextInt();
        String burc="";

        double hesapla=dogumYili%12;

        if (hesapla==0){
            islem.nextInt();
            burc="Maymun";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if(hesapla==1){
            burc="Horoz";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if (hesapla==2){
            burc="Köpek";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if (hesapla==3){
            burc="Domuz";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if (hesapla==4){
            burc="Fare";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if (hesapla==5){
            burc="Öküz";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if (hesapla==6){
            burc="Kaplan";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if(hesapla==7){
            burc="Tavşan";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if (hesapla==8){
            burc="Ejdarha";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if (hesapla==9){
            burc="Yılan";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if (hesapla==10){
            burc="At";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }else if (hesapla==11){
            burc="Koyun";
            System.out.println("Çin Zodyağına göre burcunuz: "+burc);
        }
    }
}
